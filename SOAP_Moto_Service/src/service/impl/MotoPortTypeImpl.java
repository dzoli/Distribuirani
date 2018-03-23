package service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

import model.Kategorija;
import model.Motor;
import model.Vlasnik;
import service.MotoPortType;
import service.MotorType;
import service.MotoriType;
import service.VlasniciType;
import service.VlasnikType;

@WebService(serviceName = "motoSpec", endpointInterface = "service.MotoPortType", targetNamespace = "http://www.example.org/motoSpec/")
@InInterceptors(interceptors = {"handlers.WSInInterceptor"})
@OutInterceptors(interceptors = {"handlers.WSOutInterceptor"})
@HandlerChain(file="handler-chain.xml")
public class MotoPortTypeImpl implements MotoPortType {
	@PersistenceContext
	private EntityManager em;

	@Resource
	private UserTransaction ut;

	@SuppressWarnings("unchecked")
	public MotoriType prikaziSlobodneMotore(java.lang.String in) {
		//in ce biti ID kategorije - ovo je prikazivanje slobodnih motora za izabranu kategoriju
		//ako prosledimo 0 ili negativan broj prikazce se svi slobodni motori
		
		int idKat = Integer.parseInt(in);
		List<Motor> motori = new ArrayList<>();
		
		if(idKat <= 0){
			motori = em.createQuery("select m from Motor m where m.stanje='aktivan'").getResultList();
		}else{
			motori = em.createQuery("select m from Motor m where m.stanje='aktivan' and m.kategorija.idkategorije=:idKat")
					   .setParameter("idKat", idKat)
					   .getResultList();
		}
		
		MotoriType motoriType = new MotoriType();
		for (Iterator<Motor> iterator = motori.iterator(); iterator.hasNext();) {
			Motor motor = (Motor) iterator.next();
			MotorType mt = new MotorType();
			mt.setIdmotora(Integer.toString(motor.getIdmotora()));
			mt.setCena(Float.toString(motor.getCena()));
			mt.setGodiste(motor.getGodiste());
			mt.setIdvlasnika(Integer.toString(motor.getVlasnik().getIdvlasnika()));
			mt.setMarka(motor.getMarka());
			mt.setModel(motor.getModel());
			mt.setStanje(motor.getStanje());

			motoriType.getMotori().add(mt);
		}
		return motoriType;
	}

	
	
	public boolean napraviNalog(VlasnikType in) {
		try {
			ut.begin();
			Vlasnik noviVlasnik = new Vlasnik();
			noviVlasnik.setAdresa(in.getAdresa());
			noviVlasnik.setIme(in.getIme());
			noviVlasnik.setPrezime(in.getPrezime());
			noviVlasnik.setTelefon(in.getTelefon());
			em.persist(noviVlasnik);
			ut.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean sacuvajMotor(MotorType in) {
		try {
			ut.begin();
			Motor m = new Motor();
			m.setCena(Float.parseFloat(in.getCena()));
			m.setGodiste(in.getGodiste());
			// poslao id kategorije
			Kategorija k = em.find(Kategorija.class, Integer.parseInt(in.getIdkategorije()));
			m.setKategorija(k);
			Vlasnik v = em.find(Vlasnik.class, Integer.parseInt(in.getIdvlasnika()));
			m.setVlasnik(v);
			m.setMarka(in.getMarka());
			m.setModel(in.getModel());
			m.setStanje("aktivan");
			em.persist(m);
			ut.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public VlasniciType vratiVlasnike(java.lang.String in) {
		@SuppressWarnings("unchecked")
		List<Vlasnik> vlasnici = em.createQuery("select v from Vlasnik v")
								   .getResultList();
		VlasniciType vlasniciType = new VlasniciType();
		for (Iterator<Vlasnik> iterator = vlasnici.iterator(); iterator.hasNext();) {
			Vlasnik vlasnik = (Vlasnik) iterator.next();
			VlasnikType vt = new VlasnikType();
			vt.setAdresa(vlasnik.getAdresa());
			vt.setIdvlasnika(Integer.toString(vlasnik.getIdvlasnika()));
			vt.setIme(vlasnik.getIme());
			vt.setPrezime(vlasnik.getPrezime());
			vt.setTelefon(vt.getTelefon());
			vlasniciType.getVlasnici().add(vt);
		}
		
		return vlasniciType;
	}

	public boolean kupiMotor(java.lang.String in) {
		// in - je string ID - motora koga kupujemo
		try {
			ut.begin();
			int idMotora = Integer.parseInt(in);
			Motor m = em.find(Motor.class, idMotora);
			m.setStanje("neaktivan");
			em.merge(m);
			ut.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

