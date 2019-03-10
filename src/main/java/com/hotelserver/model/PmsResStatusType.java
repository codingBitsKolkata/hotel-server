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
 * <p>Java class for pmsResStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pmsResStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Request denied"/&gt;
 *     &lt;enumeration value="No-show"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="In-house"/&gt;
 *     &lt;enumeration value="Checked out"/&gt;
 *     &lt;enumeration value="Waitlisted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pmsResStatusType")
@XmlEnum
public enum PmsResStatusType {

    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Request denied")
    REQUEST_DENIED("Request denied"),
    @XmlEnumValue("No-show")
    NO_SHOW("No-show"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("In-house")
    IN_HOUSE("In-house"),
    @XmlEnumValue("Checked out")
    CHECKED_OUT("Checked out"),
    @XmlEnumValue("Waitlisted")
    WAITLISTED("Waitlisted");
    private final String value;

    PmsResStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PmsResStatusType fromValue(String v) {
        for (PmsResStatusType c: PmsResStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
