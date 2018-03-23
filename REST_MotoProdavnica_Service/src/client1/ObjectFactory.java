
package client1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KupiRequest_QNAME = new QName("http://www.example.org/motoSpec/", "kupiRequest");
    private final static QName _KupiResponse_QNAME = new QName("http://www.example.org/motoSpec/", "kupiResponse");
    private final static QName _MotorRequest_QNAME = new QName("http://www.example.org/motoSpec/", "motorRequest");
    private final static QName _MotorResponse_QNAME = new QName("http://www.example.org/motoSpec/", "motorResponse");
    private final static QName _NalogRequest_QNAME = new QName("http://www.example.org/motoSpec/", "nalogRequest");
    private final static QName _NalogResponse_QNAME = new QName("http://www.example.org/motoSpec/", "nalogResponse");
    private final static QName _Out_QNAME = new QName("http://www.example.org/motoSpec/", "out");
    private final static QName _Out1_QNAME = new QName("http://www.example.org/motoSpec/", "out1");
    private final static QName _Out2_QNAME = new QName("http://www.example.org/motoSpec/", "out2");
    private final static QName _Out3_QNAME = new QName("http://www.example.org/motoSpec/", "out3");
    private final static QName _SlobodniMotoriRequest_QNAME = new QName("http://www.example.org/motoSpec/", "slobodniMotoriRequest");
    private final static QName _SlobodniMotoriResponse_QNAME = new QName("http://www.example.org/motoSpec/", "slobodniMotoriResponse");
    private final static QName _VlasnikRequest_QNAME = new QName("http://www.example.org/motoSpec/", "vlasnikRequest");
    private final static QName _VlasnikResponse_QNAME = new QName("http://www.example.org/motoSpec/", "vlasnikResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KupiMotor }
     * 
     */
    public KupiMotor createKupiMotor() {
        return new KupiMotor();
    }

    /**
     * Create an instance of {@link MotorType }
     * 
     */
    public MotorType createMotorType() {
        return new MotorType();
    }

    /**
     * Create an instance of {@link VlasnikType }
     * 
     */
    public VlasnikType createVlasnikType() {
        return new VlasnikType();
    }

    /**
     * Create an instance of {@link NapraviNalog }
     * 
     */
    public NapraviNalog createNapraviNalog() {
        return new NapraviNalog();
    }

    /**
     * Create an instance of {@link NapraviNalogResponse }
     * 
     */
    public NapraviNalogResponse createNapraviNalogResponse() {
        return new NapraviNalogResponse();
    }

    /**
     * Create an instance of {@link PrikaziSlobodneMotore }
     * 
     */
    public PrikaziSlobodneMotore createPrikaziSlobodneMotore() {
        return new PrikaziSlobodneMotore();
    }

    /**
     * Create an instance of {@link SacuvajMotor }
     * 
     */
    public SacuvajMotor createSacuvajMotor() {
        return new SacuvajMotor();
    }

    /**
     * Create an instance of {@link MotoriType }
     * 
     */
    public MotoriType createMotoriType() {
        return new MotoriType();
    }

    /**
     * Create an instance of {@link VlasniciType }
     * 
     */
    public VlasniciType createVlasniciType() {
        return new VlasniciType();
    }

    /**
     * Create an instance of {@link VratiVlasnike }
     * 
     */
    public VratiVlasnike createVratiVlasnike() {
        return new VratiVlasnike();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "kupiRequest")
    public JAXBElement<String> createKupiRequest(String value) {
        return new JAXBElement<String>(_KupiRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "kupiResponse")
    public JAXBElement<Boolean> createKupiResponse(Boolean value) {
        return new JAXBElement<Boolean>(_KupiResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MotorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "motorRequest")
    public JAXBElement<MotorType> createMotorRequest(MotorType value) {
        return new JAXBElement<MotorType>(_MotorRequest_QNAME, MotorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "motorResponse")
    public JAXBElement<Boolean> createMotorResponse(Boolean value) {
        return new JAXBElement<Boolean>(_MotorResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VlasnikType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "nalogRequest")
    public JAXBElement<VlasnikType> createNalogRequest(VlasnikType value) {
        return new JAXBElement<VlasnikType>(_NalogRequest_QNAME, VlasnikType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "nalogResponse")
    public JAXBElement<Boolean> createNalogResponse(Boolean value) {
        return new JAXBElement<Boolean>(_NalogResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "out")
    public JAXBElement<String> createOut(String value) {
        return new JAXBElement<String>(_Out_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "out1")
    public JAXBElement<String> createOut1(String value) {
        return new JAXBElement<String>(_Out1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "out2")
    public JAXBElement<String> createOut2(String value) {
        return new JAXBElement<String>(_Out2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "out3")
    public JAXBElement<String> createOut3(String value) {
        return new JAXBElement<String>(_Out3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "slobodniMotoriRequest")
    public JAXBElement<String> createSlobodniMotoriRequest(String value) {
        return new JAXBElement<String>(_SlobodniMotoriRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MotoriType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "slobodniMotoriResponse")
    public JAXBElement<MotoriType> createSlobodniMotoriResponse(MotoriType value) {
        return new JAXBElement<MotoriType>(_SlobodniMotoriResponse_QNAME, MotoriType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "vlasnikRequest")
    public JAXBElement<String> createVlasnikRequest(String value) {
        return new JAXBElement<String>(_VlasnikRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VlasniciType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/motoSpec/", name = "vlasnikResponse")
    public JAXBElement<VlasniciType> createVlasnikResponse(VlasniciType value) {
        return new JAXBElement<VlasniciType>(_VlasnikResponse_QNAME, VlasniciType.class, null, value);
    }

}
