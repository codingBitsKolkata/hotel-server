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
 * <p>Java class for amountDeterminationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="amountDeterminationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inclusive"/&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *     &lt;enumeration value="Cumulative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "amountDeterminationType")
@XmlEnum
public enum AmountDeterminationType {

    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative");
    private final String value;

    AmountDeterminationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountDeterminationType fromValue(String v) {
        for (AmountDeterminationType c: AmountDeterminationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}