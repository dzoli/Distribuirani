
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idvlasnika" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="godiste" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cena" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stanje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marka" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idmotora" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idkategorije" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotorType", propOrder = {
    "idvlasnika",
    "godiste",
    "cena",
    "stanje",
    "marka",
    "model",
    "idmotora",
    "idkategorije"
})
public class MotorType {

    @XmlElement(required = true)
    protected String idvlasnika;
    @XmlElement(required = true)
    protected String godiste;
    @XmlElement(required = true)
    protected String cena;
    @XmlElement(required = true)
    protected String stanje;
    @XmlElement(required = true)
    protected String marka;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String idmotora;
    @XmlElement(required = true)
    protected String idkategorije;

    /**
     * Gets the value of the idvlasnika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdvlasnika() {
        return idvlasnika;
    }

    /**
     * Sets the value of the idvlasnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdvlasnika(String value) {
        this.idvlasnika = value;
    }

    /**
     * Gets the value of the godiste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodiste() {
        return godiste;
    }

    /**
     * Sets the value of the godiste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodiste(String value) {
        this.godiste = value;
    }

    /**
     * Gets the value of the cena property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCena() {
        return cena;
    }

    /**
     * Sets the value of the cena property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCena(String value) {
        this.cena = value;
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
     * Gets the value of the marka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarka() {
        return marka;
    }

    /**
     * Sets the value of the marka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarka(String value) {
        this.marka = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the idmotora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmotora() {
        return idmotora;
    }

    /**
     * Sets the value of the idmotora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmotora(String value) {
        this.idmotora = value;
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

}
