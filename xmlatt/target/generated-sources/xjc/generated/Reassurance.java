//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.21 at 11:39:15 AM UTC 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="avenCessionTraite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numTraite" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fluxPartCnp"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="O"/&gt;
 *             &lt;enumeration value="N"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Reassurance")
public class Reassurance {

    @XmlAttribute(name = "avenCessionTraite")
    protected String avenCessionTraite;
    @XmlAttribute(name = "numTraite")
    protected String numTraite;
    @XmlAttribute(name = "fluxPartCnp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fluxPartCnp;

    /**
     * Gets the value of the avenCessionTraite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvenCessionTraite() {
        return avenCessionTraite;
    }

    /**
     * Sets the value of the avenCessionTraite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvenCessionTraite(String value) {
        this.avenCessionTraite = value;
    }

    /**
     * Gets the value of the numTraite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTraite() {
        return numTraite;
    }

    /**
     * Sets the value of the numTraite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTraite(String value) {
        this.numTraite = value;
    }

    /**
     * Gets the value of the fluxPartCnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluxPartCnp() {
        return fluxPartCnp;
    }

    /**
     * Sets the value of the fluxPartCnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluxPartCnp(String value) {
        this.fluxPartCnp = value;
    }

}
