package service.impl;


import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

import model.Motokategorija;
import model.Motooprema;
import service.KategorijaType;
import service.KategorijeType;
import service.MotoopremaPortType;
import service.OpremaType;
import service.OpremeType;

@WebService(serviceName = "Motooprema", endpointInterface = "service.MotoopremaPortType", targetNamespace = "http://www.example.org/Motooprema/")
@InInterceptors(interceptors = {"handlers.WSInInterceptor"})
@OutInterceptors(interceptors = {"handlers.WSOutInterceptor"})
public class MotoopremaPortTypeImpl implements MotoopremaPortType {
	
	@PersistenceContext
	private EntityManager em;
	
	@Resource
	private UserTransaction ut;
	
	public KategorijeType vratiSveKategorije(java.lang.String in) {
		@SuppressWarnings("unchecked")
		List<Motokategorija> kategorije = em.createQuery("SELECT m FROM Motokategorija m")
										    .getResultList();
		KategorijeType kategorijeType = new KategorijeType();
		for (Iterator<Motokategorija> iterator = kategorije.iterator(); iterator.hasNext();) {
			Motokategorija motokategorija = (Motokategorija) iterator.next();
			KategorijaType kategorijaType = new KategorijaType();
			kategorijaType.setIdkategorije(Integer.toString(motokategorija.getIdkategorije()));
			kategorijaType.setNaziv(motokategorija.getNaziv());
			
			kategorijeType.getKategorije().add(kategorijaType);
		}
		return kategorijeType;
	}

	public OpremeType vratiOpremuIzKategorije(java.lang.String in) {
		int idKat = Integer.parseInt(in);
		@SuppressWarnings("unchecked")
		List<Motooprema> motoopremas = em.createQuery("select m from Motooprema m where m.motokategorija.idkategorije=:idk")
										 .setParameter("idk", idKat)
										 .getResultList();
		OpremeType opremeType = new OpremeType();
		for (Iterator<Motooprema> iterator = motoopremas.iterator(); iterator.hasNext();) {
			Motooprema motooprema = (Motooprema) iterator.next();
			OpremaType opType = new OpremaType();
			opType.setIdkategorije(Integer.toString(motooprema.getMotokategorija().getIdkategorije()));
			opType.setIdopreme(Integer.toString(motooprema.getIdopreme()));
			opType.setNaziv(motooprema.getNaziv());
			opType.setOpis(motooprema.getOpis());
			opType.setStanje(motooprema.getStanje());
			
			opremeType.getOpreme().add(opType);
		}
		return opremeType;
	}

	public boolean kupiOpremu(java.lang.String in) {
		try {
			ut.begin();
			int idOpr = Integer.parseInt(in);
			Motooprema motooprema = em.find(Motooprema.class, idOpr);
			motooprema.setStanje("neaktivan");
			em.merge(motooprema);
			ut.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//sacuvaj opremu
	public boolean sacuvajOpremu(OpremaType opremaType) {
		try {
			ut.begin();
			Motooprema motooprema = new Motooprema();
			motooprema.setNaziv(opremaType.getNaziv()); 	
			motooprema.setOpis(opremaType.getOpis());
			
			Motokategorija kategorija = em.find(Motokategorija.class, Integer.parseInt(opremaType.getIdkategorije()));
			motooprema.setMotokategorija(kategorija);
			motooprema.setStanje("aktivan");
			em.persist(motooprema);
			ut.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}