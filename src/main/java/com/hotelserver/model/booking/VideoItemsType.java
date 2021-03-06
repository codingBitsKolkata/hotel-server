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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoItem" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                 &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoItemsType", propOrder = {
    "videoItem"
})
public class VideoItemsType {

    @XmlElement(name = "VideoItem", required = true)
    protected List<VideoItemsType.VideoItem> videoItem;

    /**
     * Gets the value of the videoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoItemsType.VideoItem }
     * 
     * 
     */
    public List<VideoItemsType.VideoItem> getVideoItem() {
        if (videoItem == null) {
            videoItem = new ArrayList<VideoItemsType.VideoItem>();
        }
        return this.videoItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VideoDescriptionType"&gt;
     *       &lt;sequence&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *       &lt;attribute name="Removal" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoItem
        extends VideoDescriptionType
    {

        @XmlAttribute(name = "Caption")
        protected String caption;
        @XmlAttribute(name = "Language")
        protected String language;
        @XmlAttribute(name = "Version")
        protected String version;
        @XmlAttribute(name = "CreateDateTime")
        @XmlSchemaType(name = "anySimpleType")
        protected String createDateTime;
        @XmlAttribute(name = "CreatorID")
        protected String creatorID;
        @XmlAttribute(name = "LastModifierID")
        protected String lastModifierID;
        @XmlAttribute(name = "LastModifyDateTime")
        @XmlSchemaType(name = "anySimpleType")
        protected String lastModifyDateTime;
        @XmlAttribute(name = "PurgeDate")
        @XmlSchemaType(name = "anySimpleType")
        protected String purgeDate;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;

        /**
         * Gets the value of the caption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaption() {
            return caption;
        }

        /**
         * Sets the value of the caption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaption(String value) {
            this.caption = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the createDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreateDateTime() {
            return createDateTime;
        }

        /**
         * Sets the value of the createDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreateDateTime(String value) {
            this.createDateTime = value;
        }

        /**
         * Gets the value of the creatorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatorID() {
            return creatorID;
        }

        /**
         * Sets the value of the creatorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatorID(String value) {
            this.creatorID = value;
        }

        /**
         * Gets the value of the lastModifierID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModifierID() {
            return lastModifierID;
        }

        /**
         * Sets the value of the lastModifierID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModifierID(String value) {
            this.lastModifierID = value;
        }

        /**
         * Gets the value of the lastModifyDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastModifyDateTime() {
            return lastModifyDateTime;
        }

        /**
         * Sets the value of the lastModifyDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastModifyDateTime(String value) {
            this.lastModifyDateTime = value;
        }

        /**
         * Gets the value of the purgeDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurgeDate() {
            return purgeDate;
        }

        /**
         * Sets the value of the purgeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurgeDate(String value) {
            this.purgeDate = value;
        }

        /**
         * Gets the value of the removal property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRemoval() {
            return removal;
        }

        /**
         * Sets the value of the removal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

    }

}
