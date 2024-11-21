//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.21 at 11:20:13 AM UTC 
//


package generated;

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
 *         &lt;element ref="{}Info"/&gt;
 *         &lt;element ref="{}SituationPro" minOccurs="0"/&gt;
 *         &lt;element ref="{}SituationFam" minOccurs="0"/&gt;
 *         &lt;element ref="{}LstAdhesions"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "info",
    "situationPro",
    "situationFam",
    "lstAdhesions"
})
@XmlRootElement(name = "Assure")
public class Assure {

    @XmlElement(name = "Info", required = true)
    protected Info info;
    @XmlElement(name = "SituationPro")
    protected SituationPro situationPro;
    @XmlElement(name = "SituationFam")
    protected SituationFam situationFam;
    @XmlElement(name = "LstAdhesions", required = true)
    protected LstAdhesions lstAdhesions;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the situationPro property.
     * 
     * @return
     *     possible object is
     *     {@link SituationPro }
     *     
     */
    public SituationPro getSituationPro() {
        return situationPro;
    }

    /**
     * Sets the value of the situationPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationPro }
     *     
     */
    public void setSituationPro(SituationPro value) {
        this.situationPro = value;
    }

    /**
     * Gets the value of the situationFam property.
     * 
     * @return
     *     possible object is
     *     {@link SituationFam }
     *     
     */
    public SituationFam getSituationFam() {
        return situationFam;
    }

    /**
     * Sets the value of the situationFam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationFam }
     *     
     */
    public void setSituationFam(SituationFam value) {
        this.situationFam = value;
    }

    /**
     * Gets the value of the lstAdhesions property.
     * 
     * @return
     *     possible object is
     *     {@link LstAdhesions }
     *     
     */
    public LstAdhesions getLstAdhesions() {
        return lstAdhesions;
    }

    /**
     * Sets the value of the lstAdhesions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstAdhesions }
     *     
     */
    public void setLstAdhesions(LstAdhesions value) {
        this.lstAdhesions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
