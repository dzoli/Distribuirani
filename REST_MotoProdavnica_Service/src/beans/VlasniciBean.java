package beans;

import java.util.List;

import client1.MotoPortType;
import client1.MotoSpec;
import client1.VlasniciType;
import client1.VlasnikType;
import port.PortFactory;

public class VlasniciBean {

	private List<VlasnikType> sviVlasnici;

	public List<VlasnikType> getSviVlasnici() {
		return sviVlasnici;
	}

	public void setSviVlasnici(List<VlasnikType> sviVlasnici) {
		this.sviVlasnici = sviVlasnici;
	}

	public VlasniciBean() {
//		MotoSpec service1 = new MotoSpec();
		PortFactory factory = PortFactory.getInstance();
		MotoPortType port1 = factory.getMotoPortSecure();
		VlasniciType vlasniciType = port1.vratiVlasnike("ignore");
		sviVlasnici = vlasniciType.getVlasnici();
	}
}
