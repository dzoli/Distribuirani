package handlers;

import java.util.Map;

import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

//ovaj samo treba da desifruje potpis
public class WSInInterceptor extends WSS4JInInterceptor{

	public WSInInterceptor() {
		super();
		getProperties().put(WSHandlerConstants.ACTION, "Signature");
		getProperties().put(WSHandlerConstants.DEC_PROP_FILE, "resource/serverKeystore.properties");
		getProperties().put(WSHandlerConstants.PW_CALLBACK_CLASS, "handlers.ServerKeystorePasswordCallback");
		getProperties().put(WSHandlerConstants.SIG_PROP_FILE, "resource/server_sign.properties");
		
		
//		getProperties().put(WSHandlerConstants.ACTION, "Signature");
////		getProperties().put(WSHandlerConstants.ACTION, "Encrypt");
//		getProperties().put(WSHandlerConstants.DEC_PROP_FILE, "resources/serverKeystore.properties");
//		getProperties().put(WSHandlerConstants.PW_CALLBACK_CLASS, "handlers.ServerKeystorePasswordCallback");
//		getProperties().put(WSHandlerConstants.SIG_PROP_FILE, "resources/server_sign.properties");
	
	}
}
