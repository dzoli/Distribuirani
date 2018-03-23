package port;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.common.ConfigurationConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import client1.MotoPortType;
import client1.MotoSpec;
import client2.Motooprema;
import client2.MotoopremaPortType;

public class PortFactory {

	private static final PortFactory fact = new PortFactory();
	
	private MotoPortType motoPort;
	private MotoopremaPortType opremaPort;
	
	private PortFactory(){
		initSecureMotoPort();
		initSecureOpremaPort();
	}

	private void initSecureMotoPort() {
		MotoSpec service1 = new MotoSpec();
		motoPort = service1.getMotoPortTypeImplPort();
		
		Client client = ClientProxy.getClient(motoPort);
		Endpoint cxfEndpoint = client.getEndpoint();
		
		Map<String, Object> outProps = new HashMap<>();
		outProps.put(WSHandlerConstants.ACTION, "Signature");
		outProps.put(WSHandlerConstants.USER, "client");
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, "handlers.ClientKeystorePasswordCallback");
		outProps.put(WSHandlerConstants.SIG_PROP_FILE, "resource/client_sign.properties");
		
		outProps.put(ConfigurationConstants.ENC_PROP_FILE, "resource/clientKeystore.properties");
		outProps.put(ConfigurationConstants.ENCRYPTION_USER, "serverMoto");
		outProps.put(ConfigurationConstants.ENC_KEY_ID, "DirectReference");
		outProps.put(ConfigurationConstants.ENCRYPTION_PARTS,
				"{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body");
		
		WSS4JOutInterceptor wssout = new WSS4JOutInterceptor(outProps);
		cxfEndpoint.getOutInterceptors().add(wssout);

		Map<String, Object> inProps = new HashMap<>();
		inProps.put(WSHandlerConstants.ACTION, "Encrypt");
		inProps.put(WSHandlerConstants.SIG_PROP_FILE, "resource/client_sign.properties");
		
		inProps.put(ConfigurationConstants.PW_CALLBACK_CLASS, "handlers.ClientKeystorePasswordCallback");
		inProps.put(ConfigurationConstants.DEC_PROP_FILE, "resource/clientKeystore.properties");

		WSS4JInInterceptor wssIn = new WSS4JInInterceptor(inProps);
		cxfEndpoint.getInInterceptors().add(wssIn);
	}

	private void initSecureOpremaPort() {
		Motooprema service1 = new Motooprema();
		opremaPort = service1.getMotoopremaPortTypeImplPort();
		
		Client client = ClientProxy.getClient(opremaPort);
		Endpoint cxfEndpoint = client.getEndpoint();
		
		Map<String, Object> outProps = new HashMap<>();
		outProps.put(WSHandlerConstants.ACTION, "Signature");
		outProps.put(WSHandlerConstants.USER, "client");
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, "handlers.ClientKeystorePasswordCallback");
		outProps.put(WSHandlerConstants.SIG_PROP_FILE, "resource/client_sign.properties");
		
		outProps.put(ConfigurationConstants.ENC_PROP_FILE, "resource/clientKeystore.properties");
		outProps.put(ConfigurationConstants.ENCRYPTION_USER, "serverMotooprema");
		outProps.put(ConfigurationConstants.ENC_KEY_ID, "DirectReference");
		outProps.put(ConfigurationConstants.ENCRYPTION_PARTS,
				"{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body");
		
		WSS4JOutInterceptor wssout = new WSS4JOutInterceptor(outProps);
		cxfEndpoint.getOutInterceptors().add(wssout);
		
		Map<String, Object> inProps = new HashMap<>();
		inProps.put(WSHandlerConstants.ACTION, "Encrypt");
		inProps.put(WSHandlerConstants.SIG_PROP_FILE, "resource/client_sign.properties");
		
		inProps.put(ConfigurationConstants.PW_CALLBACK_CLASS, "handlers.ClientKeystorePasswordCallback");
		inProps.put(ConfigurationConstants.DEC_PROP_FILE, "resource/clientKeystore.properties");
		
		WSS4JInInterceptor wssIn = new WSS4JInInterceptor(inProps);
		cxfEndpoint.getInInterceptors().add(wssIn);
	}

	public static PortFactory getInstance(){
		return fact;
	}

	public MotoPortType getMotoPortSecure() {
		return motoPort;
	}

	public MotoopremaPortType getOpremaPortSecure() {
		return opremaPort;
	}
	
	public MotoPortType getMotoPortNonsecure(){
		MotoSpec service1 = new MotoSpec();
		motoPort = service1.getMotoPortTypeImplPort();
		return motoPort;
	}
	
	public MotoopremaPortType getOpremaPortNonsecure(){
		Motooprema service1 = new Motooprema();
		opremaPort = service1.getMotoopremaPortTypeImplPort();
		return opremaPort;
	}
	
}
