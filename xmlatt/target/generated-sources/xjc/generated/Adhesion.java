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
 *         &lt;element ref="{}PeriodeAss"/&gt;
 *         &lt;element ref="{}PeriPaiPrimeAss" minOccurs="0"/&gt;
 *         &lt;element ref="{}DateDerEchPrimePayee" minOccurs="0"/&gt;
 *         &lt;element ref="{}DerMvt" minOccurs="0"/&gt;
 *         &lt;element ref="{}SomMvt" minOccurs="0"/&gt;
 *         &lt;element ref="{}CapGar" minOccurs="0"/&gt;
 *         &lt;element ref="{}Critere" minOccurs="0"/&gt;
 *         &lt;element ref="{}LstBeneficiaires"/&gt;
 *         &lt;element ref="{}LstPrets" minOccurs="0"/&gt;
 *         &lt;element ref="{}LstPrimes" minOccurs="0"/&gt;
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
    "periodeAss",
    "periPaiPrimeAss",
    "dateDerEchPrimePayee",
    "derMvt",
    "somMvt",
    "capGar",
    "critere",
    "lstBeneficiaires",
    "lstPrets",
    "lstPrimes"
})
@XmlRootElement(name = "Adhesion")
public class Adhesion {

    @XmlElement(name = "PeriodeAss", required = true)
    protected PeriodeAss periodeAss;
    @XmlElement(name = "PeriPaiPrimeAss")
    protected PeriPaiPrimeAss periPaiPrimeAss;
    @XmlElement(name = "DateDerEchPrimePayee")
    protected DateDerEchPrimePayee dateDerEchPrimePayee;
    @XmlElement(name = "DerMvt")
    protected DerMvt derMvt;
    @XmlElement(name = "SomMvt")
    protected SomMvt somMvt;
    @XmlElement(name = "CapGar")
    protected CapGar capGar;
    @XmlElement(name = "Critere")
    protected Critere critere;
    @XmlElement(name = "LstBeneficiaires", required = true)
    protected LstBeneficiaires lstBeneficiaires;
    @XmlElement(name = "LstPrets")
    protected LstPrets lstPrets;
    @XmlElement(name = "LstPrimes")
    protected LstPrimes lstPrimes;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the periodeAss property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodeAss }
     *     
     */
    public PeriodeAss getPeriodeAss() {
        return periodeAss;
    }

    /**
     * Sets the value of the periodeAss property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodeAss }
     *     
     */
    public void setPeriodeAss(PeriodeAss value) {
        this.periodeAss = value;
    }

    /**
     * Gets the value of the periPaiPrimeAss property.
     * 
     * @return
     *     possible object is
     *     {@link PeriPaiPrimeAss }
     *     
     */
    public PeriPaiPrimeAss getPeriPaiPrimeAss() {
        return periPaiPrimeAss;
    }

    /**
     * Sets the value of the periPaiPrimeAss property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriPaiPrimeAss }
     *     
     */
    public void setPeriPaiPrimeAss(PeriPaiPrimeAss value) {
        this.periPaiPrimeAss = value;
    }

    /**
     * Gets the value of the dateDerEchPrimePayee property.
     * 
     * @return
     *     possible object is
     *     {@link DateDerEchPrimePayee }
     *     
     */
    public DateDerEchPrimePayee getDateDerEchPrimePayee() {
        return dateDerEchPrimePayee;
    }

    /**
     * Sets the value of the dateDerEchPrimePayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateDerEchPrimePayee }
     *     
     */
    public void setDateDerEchPrimePayee(DateDerEchPrimePayee value) {
        this.dateDerEchPrimePayee = value;
    }

    /**
     * Gets the value of the derMvt property.
     * 
     * @return
     *     possible object is
     *     {@link DerMvt }
     *     
     */
    public DerMvt getDerMvt() {
        return derMvt;
    }

    /**
     * Sets the value of the derMvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerMvt }
     *     
     */
    public void setDerMvt(DerMvt value) {
        this.derMvt = value;
    }

    /**
     * Gets the value of the somMvt property.
     * 
     * @return
     *     possible object is
     *     {@link SomMvt }
     *     
     */
    public SomMvt getSomMvt() {
        return somMvt;
    }

    /**
     * Sets the value of the somMvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SomMvt }
     *     
     */
    public void setSomMvt(SomMvt value) {
        this.somMvt = value;
    }

    /**
     * Gets the value of the capGar property.
     * 
     * @return
     *     possible object is
     *     {@link CapGar }
     *     
     */
    public CapGar getCapGar() {
        return capGar;
    }

    /**
     * Sets the value of the capGar property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapGar }
     *     
     */
    public void setCapGar(CapGar value) {
        this.capGar = value;
    }

    /**
     * Gets the value of the critere property.
     * 
     * @return
     *     possible object is
     *     {@link Critere }
     *     
     */
    public Critere getCritere() {
        return critere;
    }

    /**
     * Sets the value of the critere property.
     * 
     * @param value
     *     allowed object is
     *     {@link Critere }
     *     
     */
    public void setCritere(Critere value) {
        this.critere = value;
    }

    /**
     * Gets the value of the lstBeneficiaires property.
     * 
     * @return
     *     possible object is
     *     {@link LstBeneficiaires }
     *     
     */
    public LstBeneficiaires getLstBeneficiaires() {
        return lstBeneficiaires;
    }

    /**
     * Sets the value of the lstBeneficiaires property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstBeneficiaires }
     *     
     */
    public void setLstBeneficiaires(LstBeneficiaires value) {
        this.lstBeneficiaires = value;
    }

    /**
     * Gets the value of the lstPrets property.
     * 
     * @return
     *     possible object is
     *     {@link LstPrets }
     *     
     */
    public LstPrets getLstPrets() {
        return lstPrets;
    }

    /**
     * Sets the value of the lstPrets property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstPrets }
     *     
     */
    public void setLstPrets(LstPrets value) {
        this.lstPrets = value;
    }

    /**
     * Gets the value of the lstPrimes property.
     * 
     * @return
     *     possible object is
     *     {@link LstPrimes }
     *     
     */
    public LstPrimes getLstPrimes() {
        return lstPrimes;
    }

    /**
     * Sets the value of the lstPrimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstPrimes }
     *     
     */
    public void setLstPrimes(LstPrimes value) {
        this.lstPrimes = value;
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
