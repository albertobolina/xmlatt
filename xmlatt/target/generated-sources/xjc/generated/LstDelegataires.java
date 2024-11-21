//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.21 at 11:20:13 AM UTC 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Delegataire" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "delegataire"
})
@XmlRootElement(name = "LstDelegataires")
public class LstDelegataires {

    @XmlElement(name = "Delegataire", required = true)
    protected List<Delegataire> delegataire;
    @XmlAttribute(name = "nbr", required = true)
    protected String nbr;

    /**
     * Gets the value of the delegataire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegataire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelegataire().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delegataire }
     * 
     * 
     */
    public List<Delegataire> getDelegataire() {
        if (delegataire == null) {
            delegataire = new ArrayList<Delegataire>();
        }
        return this.delegataire;
    }

    /**
     * Gets the value of the nbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbr() {
        return nbr;
    }

    /**
     * Sets the value of the nbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbr(String value) {
        this.nbr = value;
    }

}
