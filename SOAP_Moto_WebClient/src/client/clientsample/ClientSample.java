package client.clientsample;

import java.util.Iterator;

import client.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        MotoSpec service1 = new MotoSpec();
	        System.out.println("Create Web Service...");
	        MotoPortType port1 = service1.getMotoPortTypeImplPort();
	       
	        
	        System.out.println("Call Web Service Operation...");
	        
	        String idKategorije = "0";
	        MotoriType resp = port1.prikaziSlobodneMotore(idKategorije);
	        for (Iterator<MotorType> iterator = resp.getMotori().iterator(); iterator.hasNext();) {
				MotorType m = (MotorType) iterator.next();
				System.out.println(" >>  " + m.getModel() + " " + m.getStanje() + " " + m.getGodiste());
	        }	        
	        
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
