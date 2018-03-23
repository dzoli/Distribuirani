package handlers;

import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.sun.mail.handlers.handler_base;

public class WSOutInterceptor extends WSS4JOutInterceptor{

	public WSOutInterceptor() {
		super();
		getProperties().put(WSHandlerConstants.ACTION, "Encrypt");
		getProperties().put(WSHandlerConstants.ENC_PROP_FILE, "resource/serverKeystore.properties");
		getProperties().put(WSHandlerConstants.PW_CALLBACK_CLASS, "handlers.ServerKeystorePasswordCallback");
		getProperties().put(WSHandlerConstants.ENCRYPTION_USER, "client");
		getProperties().put(WSHandlerConstants.USER, "serverMoto");
		getProperties().put(WSHandlerConstants.SIG_PROP_FILE, "resource/server_sign.properties");

		
//		getProperties().put(WSHandlerConstants.ACTION, "Encrypt");
////		getProperties().put(WSHandlerConstants.ACTION, "Encrypt");
//		getProperties().put(WSHandlerConstants.ENC_PROP_FILE, "resources/serverKeystore.properties");
//		getProperties().put(WSHandlerConstants.PW_CALLBACK_CLASS, "handlers.ServerKeystorePasswordCallback");
//		getProperties().put(WSHandlerConstants.ENCRYPTION_USER, "client");
//		getProperties().put(WSHandlerConstants.USER, "server");
//		getProperties().put(WSHandlerConstants.SIG_PROP_FILE, "resources/server_sign.properties");
		
	}

}
