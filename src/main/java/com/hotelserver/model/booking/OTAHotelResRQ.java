//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.13 at 11:52:17 PM IST 
//


package com.hotelserver.model.booking;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelResRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DonationInformation" type="{http://www.opentravel.org/OTA/2003/05}DonationType" minOccurs="0"/&gt;
 *         &lt;element name="RebatePrograms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "donationInformation",
    "rebatePrograms"
})
@XmlRootElement(name = "OTA_HotelResRQ")
public class OTAHotelResRQ
    extends HotelResRequestType
{

    @XmlElement(name = "DonationInformation")
    protected DonationType donationInformation;
    @XmlElement(name = "RebatePrograms")
    protected OTAHotelResRQ.RebatePrograms rebatePrograms;

    /**
     * Gets the value of the donationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DonationType }
     *     
     */
    public DonationType getDonationInformation() {
        return donationInformation;
    }

    /**
     * Sets the value of the donationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonationType }
     *     
     */
    public void setDonationInformation(DonationType value) {
        this.donationInformation = value;
    }

    /**
     * Gets the value of the rebatePrograms property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelResRQ.RebatePrograms }
     *     
     */
    public OTAHotelResRQ.RebatePrograms getRebatePrograms() {
        return rebatePrograms;
    }

    /**
     * Sets the value of the rebatePrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelResRQ.RebatePrograms }
     *     
     */
    public void setRebatePrograms(OTAHotelResRQ.RebatePrograms value) {
        this.rebatePrograms = value;
    }


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
     *         &lt;element name="RebateProgram" type="{http://www.opentravel.org/OTA/2003/05}RebateType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "rebateProgram"
    })
    public static class RebatePrograms {

        @XmlElement(name = "RebateProgram")
        protected List<RebateType> rebateProgram;

        /**
         * Gets the value of the rebateProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rebateProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRebateProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RebateType }
         * 
         * 
         */
        public List<RebateType> getRebateProgram() {
            if (rebateProgram == null) {
                rebateProgram = new ArrayList<RebateType>();
            }
            return this.rebateProgram;
        }

    }

}
