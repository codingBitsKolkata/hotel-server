//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.10 at 01:51:57 PM IST 
//


package com.hotelserver.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevenueCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SummaryAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RevenueDetails" type="{http://www.opentravel.org/OTA/2003/05}RevenueDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RevenueCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueCategoryType", propOrder = {
    "summaryAmount",
    "revenueDetails"
})
public class RevenueCategoryType {

    @XmlElement(name = "SummaryAmount")
    protected RevenueCategoryType.SummaryAmount summaryAmount;
    @XmlElement(name = "RevenueDetails")
    protected RevenueDetailsType revenueDetails;
    @XmlAttribute(name = "RevenueCategoryCode")
    protected String revenueCategoryCode;

    /**
     * Gets the value of the summaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueCategoryType.SummaryAmount }
     *     
     */
    public RevenueCategoryType.SummaryAmount getSummaryAmount() {
        return summaryAmount;
    }

    /**
     * Sets the value of the summaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueCategoryType.SummaryAmount }
     *     
     */
    public void setSummaryAmount(RevenueCategoryType.SummaryAmount value) {
        this.summaryAmount = value;
    }

    /**
     * Gets the value of the revenueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RevenueDetailsType }
     *     
     */
    public RevenueDetailsType getRevenueDetails() {
        return revenueDetails;
    }

    /**
     * Sets the value of the revenueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueDetailsType }
     *     
     */
    public void setRevenueDetails(RevenueDetailsType value) {
        this.revenueDetails = value;
    }

    /**
     * Gets the value of the revenueCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCategoryCode() {
        return revenueCategoryCode;
    }

    /**
     * Sets the value of the revenueCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCategoryCode(String value) {
        this.revenueCategoryCode = value;
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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SummaryAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }

}
