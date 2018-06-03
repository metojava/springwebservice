//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.03 at 02:35:43 PM EDT 
//


package com.shop.my;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Products complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Products">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Pname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pdescr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pprice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Ppicture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Products", propOrder = {
    "pid",
    "pname",
    "pdescr",
    "pprice",
    "ppicture"
})
public class Products {

    @XmlElement(name = "Pid", required = true)
    protected BigInteger pid;
    @XmlElement(name = "Pname", required = true)
    protected String pname;
    @XmlElement(name = "Pdescr", required = true)
    protected String pdescr;
    @XmlElement(name = "Pprice")
    protected float pprice;
    @XmlElement(name = "Ppicture", required = true)
    protected String ppicture;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPid(BigInteger value) {
        this.pid = value;
    }

    /**
     * Gets the value of the pname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPname() {
        return pname;
    }

    /**
     * Sets the value of the pname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPname(String value) {
        this.pname = value;
    }

    /**
     * Gets the value of the pdescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdescr() {
        return pdescr;
    }

    /**
     * Sets the value of the pdescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdescr(String value) {
        this.pdescr = value;
    }

    /**
     * Gets the value of the pprice property.
     * 
     */
    public float getPprice() {
        return pprice;
    }

    /**
     * Sets the value of the pprice property.
     * 
     */
    public void setPprice(float value) {
        this.pprice = value;
    }

    /**
     * Gets the value of the ppicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpicture() {
        return ppicture;
    }

    /**
     * Sets the value of the ppicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpicture(String value) {
        this.ppicture = value;
    }

}
