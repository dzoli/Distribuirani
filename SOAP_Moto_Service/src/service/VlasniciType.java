
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VlasniciType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VlasniciType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vlasnici" type="{http://www.example.org/motoSpec/}VlasnikType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VlasniciType", propOrder = {
    "vlasnici"
})
public class VlasniciType {

    protected List<VlasnikType> vlasnici;

    /**
     * Gets the value of the vlasnici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlasnici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVlasnici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VlasnikType }
     * 
     * 
     */
    public List<VlasnikType> getVlasnici() {
        if (vlasnici == null) {
            vlasnici = new ArrayList<VlasnikType>();
        }
        return this.vlasnici;
    }

}
