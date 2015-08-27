
package com.dao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="add_line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressClass", propOrder = {
    "addLine1",
    "addLine2",
    "addressId",
    "city",
    "state",
    "stateCode",
    "zipcode"
})
public class AddressClass {

    @XmlElement(name = "add_line1")
    protected String addLine1;
    @XmlElement(name = "add_line2")
    protected String addLine2;
    @XmlElement(name = "address_id")
    protected int addressId;
    protected String city;
    protected String state;
    @XmlElement(name = "state_code")
    protected String stateCode;
    protected int zipcode;

    /**
     * Gets the value of the addLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddLine1() {
        return addLine1;
    }

    /**
     * Sets the value of the addLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddLine1(String value) {
        this.addLine1 = value;
    }

    /**
     * Gets the value of the addLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddLine2() {
        return addLine2;
    }

    /**
     * Sets the value of the addLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddLine2(String value) {
        this.addLine2 = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     */
    public void setAddressId(int value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     */
    public void setZipcode(int value) {
        this.zipcode = value;
    }

}
