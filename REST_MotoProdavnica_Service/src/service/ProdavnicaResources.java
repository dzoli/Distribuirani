package service;

import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.arjuna.mw.wst11.UserTransactionFactory;
import com.arjuna.wst.SystemException;
import com.arjuna.wst.UnknownTransactionException;
import com.arjuna.wst.WrongStateException;

import client1.MotoPortType;
import client1.MotoSpec;
import client1.MotorType;
import client1.MotoriType;
import client2.KategorijaType;
import client2.KategorijeType;
import client2.Motooprema;
import client2.MotoopremaPortType;
import client2.OpremaType;
import client2.OpremeType;
import model.Motor;
import port.PortFactory;

@RequestScoped
@Path("/prodavnica") // /rest/prodavnica
public class ProdavnicaResources {

	PortFactory factory = PortFactory.getInstance();
	MotoopremaPortType portOprema = factory.getOpremaPortSecure();
	MotoPortType portMotor = factory.getMotoPortSecure();
	
	@PersistenceContext(unitName="Moto_JPA")
	private EntityManager emMoto;
	
	@PersistenceContext(unitName="MotoOprema_JPA")
	private EntityManager emOprema;
	
	
	@Path("/getKategorije")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<KategorijaType> getKategorije() {
		try {
	        KategorijeType kategorijeType = portOprema.vratiSveKategorije("ignore");	
	        List<KategorijaType> kategorijaTypes = kategorijeType.getKategorije();
	        
	        return kategorijaTypes;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Path("/proizvodiIzKategorije")
	@GET
	public void proizvodiIzKategorije(@QueryParam("idkat") String idkat,
										  @Context HttpServletRequest req,
										  @Context HttpServletResponse res) throws ServletException, IOException{
		MotoriType motoriType = portMotor.prikaziSlobodneMotore(idkat);
		List<MotorType> motori = motoriType.getMotori();
		
		OpremeType opremeType = portOprema.vratiOpremuIzKategorije(idkat);
		List<OpremaType> opreme = opremeType.getOpreme();
		
		System.out.println(" == motori.size = " + motori.size());
		System.out.println(" == opreme.size = " + opreme.size());
		
		
		req.setAttribute("motori", motori);
		req.setAttribute("opreme", opreme);
		req.getRequestDispatcher("/Kupovina.jsp").forward(req, res);
	}
	
	@Path("/kupiMotorSaOpremom")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public void kupiMotorSaOpremom(@FormParam("idMotora") String idMotora,
									  @FormParam("idOpreme") String idOpreme,
									  @Context HttpServletRequest req,
									  @Context HttpServletResponse res){
		com.arjuna.mw.wst11.UserTransaction ut = UserTransactionFactory.userTransaction(); 
		try {
			ut.begin();
	        System.out.println(" == Motor id: " + idMotora);
	        System.out.println(" == Optema id: " + idOpreme);

	        Motor m = emMoto.find(Motor.class, 
	        					  Integer.parseInt(idMotora));
	        model.Motooprema mo = emOprema.find(model.Motooprema.class, 
	        									Integer.parseInt(idOpreme));
	        String msg;
	        
	        if(idMotora.isEmpty() || idOpreme.isEmpty()){
	        	System.out.println(" == ne validan id == ");
	        	ut.rollback(); 
	        	msg = "Operacija nije uspela! ";

	        	msg += "Izabrani motor " + m.getMarka() + " model " + m.getModel() +" nije kupljen.";
	        	req.setAttribute("message", msg);
	        	req.getRequestDispatcher("/Kupovina.jsp").forward(req, res);
	 	    }else{
	        	System.out.println("= Kupljen motor = " + portMotor.kupiMotor(idMotora));
	        	System.out.println("= Kupljena oprema = " + portOprema.kupiOpremu(idOpreme));
	        	msg = "Cestitamo postali ste vlasnik motora: ";
	        	
	        	
	        	req.setAttribute("message", msg + m.getMarka() + " , model: " + m.getModel()+". " +
	        					            "Na poklon dobijate i opremu: " + mo.getNaziv() + ", opis: " + mo.getOpis());
	        	req.getRequestDispatcher("/Kupovina.jsp").forward(req, res);
	        }
	        ut.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				ut.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	@Path("/motorSaOpremom")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public boolean kupiMotorSaOpremomPostman(@FormParam("idMotora") String idMotora,
									  @FormParam("idOpreme") String idOpreme
//									 ,@Context HttpServletRequest req,
//									  @Context HttpServletResponse res
									  ){
		com.arjuna.mw.wst11.UserTransaction ut = UserTransactionFactory.userTransaction(); 
		try {
			ut.begin();
	        System.out.println(" == Motor id: " + idMotora);
	        System.out.println(" == Optema id: " + idOpreme);
	        
	        if(idMotora.isEmpty() || idOpreme.isEmpty()){
	        	System.out.println(" == ne validan id == ");
	        	ut.rollback(); 
	        	return false;
//	        	req.setAttribute("message", "Operacija nije uspela!");
//	        	req.getRequestDispatcher("/Kupovina.jsp").forward(req, res);
	 	    }else{
	        	System.out.println("= Kupljen motor = " + portMotor.kupiMotor(idMotora));
	        	System.out.println("= Kupljena oprema = " + portOprema.kupiOpremu(idOpreme));
	        	
//	        	Motor m = emMoto.find(Motor.class, Integer.parseInt(idMotora));
//	        	model.Motooprema mo = emOprema.find(model.Motooprema.class, Integer.parseInt(idOpreme));
	        	
//	        	String msg = "Cestitamo postali ste vlasnik motora: ";
//	        	req.setAttribute("message", msg + m.getMarka() + " , model: " + m.getModel()+". " +
//	        					            "Na poklon dobijate i opremu: " + mo.getNaziv() + ", opis: " + mo.getOpis());
//	        	req.getRequestDispatcher("/Kupovina.jsp").forward(req, res);
	        }
	        ut.commit();
	        return true;
		} catch (Exception e) {
			e.printStackTrace();
			try {
				ut.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			return false;
		}
	}
	
	@Path("/savucajMotor")
	@POST
	public void sacuvajMotor(@FormParam("cena") String cena, @FormParam("godiste") String godiste,
							 @FormParam("marka") String marka, @FormParam("model") String model,
							 @FormParam("idvlasnika") String idvlasnika, @FormParam("idkategorije") String idkategorije,
							 @Context HttpServletRequest req,
							 @Context HttpServletResponse res) throws ServletException, IOException{ 
		// cena, godiste, marka, model, idvlasnika, idkategorije
		MotorType motorType = new MotorType();
		motorType.setCena(cena);
		motorType.setGodiste(godiste);
		motorType.setMarka(marka);
		motorType.setModel(model);
		motorType.setIdvlasnika(idvlasnika);
		motorType.setIdkategorije(idkategorije);
		
		portMotor.sacuvajMotor(motorType);
		
		Integer idMotora = (Integer) emMoto.createQuery("select max(m.idmotora) from Motor m")
										   .getSingleResult();
		req.setAttribute("message", "ID novog motora je: " + idMotora);
		req.getRequestDispatcher("/NoviMotor.jsp")
		   .forward(req, res);
	}
	
	@Path("/sacuvajOpremu")
	@POST
	public void sacuvajOpremu(@FormParam("naziv") String naziv,
							  @FormParam("opis") String opis,
							  @FormParam("idkategorije") String idkategorije,
							  @Context HttpServletRequest req,
							  @Context HttpServletResponse res) throws ServletException, IOException{
		OpremaType opremaType = new OpremaType();
		opremaType.setNaziv(naziv);
		opremaType.setOpis(opis);
		opremaType.setIdkategorije(idkategorije);
		
		portOprema.sacuvajOpremu(opremaType);
	
		Integer idOpreme = (Integer) emOprema.createQuery("select max(o.idopreme) from Motooprema o")
											 .getSingleResult();
		req.setAttribute("message", "ID nove opreme je: " + idOpreme);
		req.getRequestDispatcher("/NovaOprema.jsp")
		   .forward(req, res);
	}
	
}
