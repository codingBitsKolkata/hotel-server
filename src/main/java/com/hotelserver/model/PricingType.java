//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.10 at 01:51:57 PM IST 
//


package com.hotelserver.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pricingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pricingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Per stay"/&gt;
 *     &lt;enumeration value="Per person"/&gt;
 *     &lt;enumeration value="Per night"/&gt;
 *     &lt;enumeration value="Per person per night"/&gt;
 *     &lt;enumeration value="Per use"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pricingType")
@XmlEnum
public enum PricingType {

    @XmlEnumValue("Per stay")
    PER_STAY("Per stay"),
    @XmlEnumValue("Per person")
    PER_PERSON("Per person"),
    @XmlEnumValue("Per night")
    PER_NIGHT("Per night"),
    @XmlEnumValue("Per person per night")
    PER_PERSON_PER_NIGHT("Per person per night"),
    @XmlEnumValue("Per use")
    PER_USE("Per use");
    private final String value;

    PricingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingType fromValue(String v) {
        for (PricingType c: PricingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
