package beans;

import java.util.List;

import client2.KategorijaType;
import client2.KategorijeType;
import client2.Motooprema;
import client2.MotoopremaPortType;
import port.PortFactory;

public class KategorijeBean {

	private List<KategorijaType> sveKategorije;

	public List<KategorijaType> getSveKategorije() {
		return sveKategorije;
	}

	public void setSveKategorije(List<KategorijaType> sveKategorije) {
		this.sveKategorije = sveKategorije;
	}

	public KategorijeBean() {
//		Motooprema service1 = new Motooprema();
//		MotoopremaPortType port1 = service1.getMotoopremaPortTypeImplPort();
		
		PortFactory factory = PortFactory.getInstance();
		MotoopremaPortType port1 = factory.getOpremaPortSecure();
		KategorijeType kategorijeType = port1.vratiSveKategorije("ignore");
		sveKategorije = kategorijeType.getKategorije();
	}
}
