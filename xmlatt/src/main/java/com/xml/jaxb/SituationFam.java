//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.21 at 11:10:07 AM UTC 
//


package com.xml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="nbrEnf" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nbrEnfHand" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sitFam" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SituationFam")
public class SituationFam {

    @XmlAttribute(name = "nbrEnf")
    protected String nbrEnf;
    @XmlAttribute(name = "nbrEnfHand")
    protected String nbrEnfHand;
    @XmlAttribute(name = "sitFam")
    protected String sitFam;

    /**
     * Gets the value of the nbrEnf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbrEnf() {
        return nbrEnf;
    }

    /**
     * Sets the value of the nbrEnf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbrEnf(String value) {
        this.nbrEnf = value;
    }

    /**
     * Gets the value of the nbrEnfHand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbrEnfHand() {
        return nbrEnfHand;
    }

    /**
     * Sets the value of the nbrEnfHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbrEnfHand(String value) {
        this.nbrEnfHand = value;
    }

    /**
     * Gets the value of the sitFam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitFam() {
        return sitFam;
    }

    /**
     * Sets the value of the sitFam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitFam(String value) {
        this.sitFam = value;
    }

}
