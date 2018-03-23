package handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class LoggHandler implements SOAPHandler<SOAPMessageContext> {

	@SuppressWarnings("unchecked")
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		if (((Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)).booleanValue())
			return true;

		// obradjuje samo ulazne poruke
		SOAPMessage msg = context.getMessage();
		Iterator<SOAPHeaderElement> i;
//		try {
//			i = msg.getSOAPHeader().examineAllHeaderElements();
//			String msgID = null;
//			while (i.hasNext() && msgID == null) {
//				SOAPHeaderElement elem = i.next();
//				QName qname = elem.getElementQName();
//				QName MSGID_HDR = new QName("mynamespace", "datum");
//				System.out.println("h elem");
//				if (qname.equals(MSGID_HDR)) {
//					msgID = elem.getElementsByTagName("CurrentTime").item(0).getTextContent();
//					System.out.println(" == msgs id: " + msgID);
//				}
//			}
//
//			if (msgID == null) {
//				System.out.println(" == Nema header elementaa.");
//				return false;
//			}
//
//			File msgFile = new File("msg.xml");
//			msgFile.createNewFile();
//			msg.writeTo(new FileOutputStream(msgFile));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}

		try {
			DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
			Date today = Calendar.getInstance().getTime();        
			String now = df.format(today);

			File msgFile = new File("msg" + now + ".xml");
			System.out.println(" == " + msgFile.getAbsolutePath() + " == ");
			msgFile.createNewFile();
			msg.writeTo(new FileOutputStream(msgFile));
		} catch (IOException | SOAPException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
