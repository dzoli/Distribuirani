
package client2;

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

    private final static QName _In_QNAME = new QName("http://www.example.org/Motooprema/", "in");
    private final static QName _In1_QNAME = new QName("http://www.example.org/Motooprema/", "in1");
    private final static QName _In2_QNAME = new QName("http://www.example.org/Motooprema/", "in2");
    private final static QName _KategorijeRequest_QNAME = new QName("http://www.example.org/Motooprema/", "kategorijeRequest");
    private final static QName _KategorijeResponse_QNAME = new QName("http://www.example.org/Motooprema/", "kategorijeResponse");
    private final static QName _KupiRequest_QNAME = new QName("http://www.example.org/Motooprema/", "kupiRequest");
    private final static QName _KupiResponse_QNAME = new QName("http://www.example.org/Motooprema/", "kupiResponse");
    private final static QName _NovaRequest_QNAME = new QName("http://www.example.org/Motooprema/", "novaRequest");
    private final static QName _NovaResponse_QNAME = new QName("http://www.example.org/Motooprema/", "novaResponse");
    private final static QName _OpremaRequest_QNAME = new QName("http://www.example.org/Motooprema/", "opremaRequest");
    private final static QName _OpremaResponse_QNAME = new QName("http://www.example.org/Motooprema/", "opremaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KategorijeType }
     * 
     */
    public KategorijeType createKategorijeType() {
        return new KategorijeType();
    }

    /**
     * Create an instance of {@link KupiOpremuResponse }
     * 
     */
    public KupiOpremuResponse createKupiOpremuResponse() {
        return new KupiOpremuResponse();
    }

    /**
     * Create an instance of {@link OpremaType }
     * 
     */
    public OpremaType createOpremaType() {
        return new OpremaType();
    }

    /**
     * Create an instance of {@link OpremeType }
     * 
     */
    public OpremeType createOpremeType() {
        return new OpremeType();
    }

    /**
     * Create an instance of {@link SacuvajOpremuResponse }
     * 
     */
    public SacuvajOpremuResponse createSacuvajOpremuResponse() {
        return new SacuvajOpremuResponse();
    }

    /**
     * Create an instance of {@link VratiOpremuIzKategorijeResponse }
     * 
     */
    public VratiOpremuIzKategorijeResponse createVratiOpremuIzKategorijeResponse() {
        return new VratiOpremuIzKategorijeResponse();
    }

    /**
     * Create an instance of {@link VratiSveKategorije }
     * 
     */
    public VratiSveKategorije createVratiSveKategorije() {
        return new VratiSveKategorije();
    }

    /**
     * Create an instance of {@link VratiSveKategorijeResponse }
     * 
     */
    public VratiSveKategorijeResponse createVratiSveKategorijeResponse() {
        return new VratiSveKategorijeResponse();
    }

    /**
     * Create an instance of {@link KategorijaType }
     * 
     */
    public KategorijaType createKategorijaType() {
        return new KategorijaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "in")
    public JAXBElement<String> createIn(String value) {
        return new JAXBElement<String>(_In_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "in1")
    public JAXBElement<String> createIn1(String value) {
        return new JAXBElement<String>(_In1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "in2")
    public JAXBElement<String> createIn2(String value) {
        return new JAXBElement<String>(_In2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "kategorijeRequest")
    public JAXBElement<String> createKategorijeRequest(String value) {
        return new JAXBElement<String>(_KategorijeRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KategorijeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "kategorijeResponse")
    public JAXBElement<KategorijeType> createKategorijeResponse(KategorijeType value) {
        return new JAXBElement<KategorijeType>(_KategorijeResponse_QNAME, KategorijeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "kupiRequest")
    public JAXBElement<String> createKupiRequest(String value) {
        return new JAXBElement<String>(_KupiRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "kupiResponse")
    public JAXBElement<Boolean> createKupiResponse(Boolean value) {
        return new JAXBElement<Boolean>(_KupiResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpremaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "novaRequest")
    public JAXBElement<OpremaType> createNovaRequest(OpremaType value) {
        return new JAXBElement<OpremaType>(_NovaRequest_QNAME, OpremaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "novaResponse")
    public JAXBElement<Boolean> createNovaResponse(Boolean value) {
        return new JAXBElement<Boolean>(_NovaResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "opremaRequest")
    public JAXBElement<String> createOpremaRequest(String value) {
        return new JAXBElement<String>(_OpremaRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpremeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Motooprema/", name = "opremaResponse")
    public JAXBElement<OpremeType> createOpremaResponse(OpremeType value) {
        return new JAXBElement<OpremeType>(_OpremaResponse_QNAME, OpremeType.class, null, value);
    }

}
