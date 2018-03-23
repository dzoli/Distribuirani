package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import client.MotoDesc;
//import client.MotoDescPortType;
import client.MotoPortType;
import client.MotoSpec;
import client.VlasnikType;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ime = request.getParameter("ime"),
			   prezime = request.getParameter("prezime"),
			   adresa = request.getParameter("adresa"),
			   telefon = request.getParameter("telefon");
		
		VlasnikType vt = new VlasnikType();
		vt.setIme(ime);
		vt.setPrezime(prezime);
		vt.setAdresa(adresa);
		vt.setTelefon(telefon);
		
		MotoSpec service = new MotoSpec();
		MotoPortType port = service.getMotoPortTypeImplPort();
		
//        MotoDesc service1 = new MotoDesc();
//        MotoDescPortType port1 = service1.getMotoDescPortTypeImplPort();
        
        request.setAttribute("mesage", port.napraviNalog(vt) ? "uspesno napravljen vlasnik" : "vlasnik nije uspesno napravljen");
        request.getRequestDispatcher("/home.jsp").forward(request, response);
	}

}
