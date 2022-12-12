//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.11 at 09:54:00 PM CET 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TRanijePrijave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRanijePrijave">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatumPodnosenjaRanije" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BrojRanijePrijave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Oznaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRanijePrijave", propOrder = {
    "datumPodnosenjaRanije",
    "brojRanijePrijave",
    "oznaka"
})
public class TRanijePrijave {

    @XmlElement(name = "DatumPodnosenjaRanije", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenjaRanije;
    @XmlElement(name = "BrojRanijePrijave")
    protected int brojRanijePrijave;
    @XmlElement(name = "Oznaka", required = true)
    protected String oznaka;

    /**
     * Gets the value of the datumPodnosenjaRanije property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodnosenjaRanije() {
        return datumPodnosenjaRanije;
    }

    /**
     * Sets the value of the datumPodnosenjaRanije property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodnosenjaRanije(XMLGregorianCalendar value) {
        this.datumPodnosenjaRanije = value;
    }

    /**
     * Gets the value of the brojRanijePrijave property.
     * 
     */
    public int getBrojRanijePrijave() {
        return brojRanijePrijave;
    }

    /**
     * Sets the value of the brojRanijePrijave property.
     * 
     */
    public void setBrojRanijePrijave(int value) {
        this.brojRanijePrijave = value;
    }

    /**
     * Gets the value of the oznaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOznaka() {
        return oznaka;
    }

    /**
     * Sets the value of the oznaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOznaka(String value) {
        this.oznaka = value;
    }

}