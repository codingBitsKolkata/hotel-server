//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.13 at 11:52:17 PM IST 
//


package com.hotelserver.model.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorpDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorpDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GSTDetails" type="{http://www.opentravel.org/OTA/2003/05}GSTDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="Markup" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BusinessModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorpDetailsType", propOrder = {
    "gstDetails",
    "markup",
    "businessModel"
})
public class CorpDetailsType {

    @XmlElement(name = "GSTDetails")
    protected GSTDetailsType gstDetails;
    @XmlElement(name = "Markup")
    protected Float markup;
    @XmlElement(name = "BusinessModel")
    protected String businessModel;

    /**
     * Gets the value of the gstDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GSTDetailsType }
     *     
     */
    public GSTDetailsType getGSTDetails() {
        return gstDetails;
    }

    /**
     * Sets the value of the gstDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSTDetailsType }
     *     
     */
    public void setGSTDetails(GSTDetailsType value) {
        this.gstDetails = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMarkup(Float value) {
        this.markup = value;
    }

    /**
     * Gets the value of the businessModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessModel() {
        return businessModel;
    }

    /**
     * Sets the value of the businessModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessModel(String value) {
        this.businessModel = value;
    }

}
