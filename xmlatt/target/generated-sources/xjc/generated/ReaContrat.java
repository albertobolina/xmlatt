//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.21 at 11:20:13 AM UTC 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}Reassurance" minOccurs="0"/&gt;
 *         &lt;element ref="{}LstContrats"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reassurance",
    "lstContrats"
})
@XmlRootElement(name = "ReaContrat")
public class ReaContrat {

    @XmlElement(name = "Reassurance")
    protected Reassurance reassurance;
    @XmlElement(name = "LstContrats", required = true)
    protected LstContrats lstContrats;

    /**
     * Gets the value of the reassurance property.
     * 
     * @return
     *     possible object is
     *     {@link Reassurance }
     *     
     */
    public Reassurance getReassurance() {
        return reassurance;
    }

    /**
     * Sets the value of the reassurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reassurance }
     *     
     */
    public void setReassurance(Reassurance value) {
        this.reassurance = value;
    }

    /**
     * Gets the value of the lstContrats property.
     * 
     * @return
     *     possible object is
     *     {@link LstContrats }
     *     
     */
    public LstContrats getLstContrats() {
        return lstContrats;
    }

    /**
     * Sets the value of the lstContrats property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstContrats }
     *     
     */
    public void setLstContrats(LstContrats value) {
        this.lstContrats = value;
    }

}
