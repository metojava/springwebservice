//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.07 at 10:15:23 PM PDT 
//


package com.myshop.webservices.getproductsservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.shop.my.Products;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productsDetails" type="{http://my.shop.com}Products"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productsDetails"
})
@XmlRootElement(name = "GetProductsResponse")
public class GetProductsResponse {

    @XmlElement(required = true)
    protected Products productsDetails;

    /**
     * Gets the value of the productsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Products }
     *     
     */
    public Products getProductsDetails() {
        return productsDetails;
    }

    /**
     * Sets the value of the productsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Products }
     *     
     */
    public void setProductsDetails(Products value) {
        this.productsDetails = value;
    }

}
