
package client2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpremaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpremaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stanje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idkategorije" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idopreme" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpremaType", propOrder = {
    "naziv",
    "stanje",
    "opis",
    "idkategorije",
    "idopreme"
})
public class OpremaType {

    @XmlElement(required = true)
    protected String naziv;
    @XmlElement(required = true)
    protected String stanje;
    @XmlElement(required = true)
    protected String opis;
    @XmlElement(required = true)
    protected String idkategorije;
    @XmlElement(required = true)
    protected String idopreme;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the stanje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanje() {
        return stanje;
    }

    /**
     * Sets the value of the stanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanje(String value) {
        this.stanje = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the idkategorije property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdkategorije() {
        return idkategorije;
    }

    /**
     * Sets the value of the idkategorije property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdkategorije(String value) {
        this.idkategorije = value;
    }

    /**
     * Gets the value of the idopreme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdopreme() {
        return idopreme;
    }

    /**
     * Sets the value of the idopreme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdopreme(String value) {
        this.idopreme = value;
    }

}
