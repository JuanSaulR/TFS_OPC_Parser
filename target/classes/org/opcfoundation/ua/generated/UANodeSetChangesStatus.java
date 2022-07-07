//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 10:44:03 AM PDT 
//


package org.opcfoundation.ua.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="NodesToAdd" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}NodeSetStatusList" minOccurs="0"/&gt;
 *         &lt;element name="ReferencesToAdd" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}NodeSetStatusList" minOccurs="0"/&gt;
 *         &lt;element name="NodesToDelete" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}NodeSetStatusList" minOccurs="0"/&gt;
 *         &lt;element name="ReferencesToDelete" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}NodeSetStatusList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="TransactionId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodesToAdd",
    "referencesToAdd",
    "nodesToDelete",
    "referencesToDelete"
})
@XmlRootElement(name = "UANodeSetChangesStatus")
public class UANodeSetChangesStatus {

    @XmlElement(name = "NodesToAdd")
    protected NodeSetStatusList nodesToAdd;
    @XmlElement(name = "ReferencesToAdd")
    protected NodeSetStatusList referencesToAdd;
    @XmlElement(name = "NodesToDelete")
    protected NodeSetStatusList nodesToDelete;
    @XmlElement(name = "ReferencesToDelete")
    protected NodeSetStatusList referencesToDelete;
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "TransactionId", required = true)
    protected String transactionId;

    /**
     * Gets the value of the nodesToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSetStatusList }
     *     
     */
    public NodeSetStatusList getNodesToAdd() {
        return nodesToAdd;
    }

    /**
     * Sets the value of the nodesToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSetStatusList }
     *     
     */
    public void setNodesToAdd(NodeSetStatusList value) {
        this.nodesToAdd = value;
    }

    /**
     * Gets the value of the referencesToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSetStatusList }
     *     
     */
    public NodeSetStatusList getReferencesToAdd() {
        return referencesToAdd;
    }

    /**
     * Sets the value of the referencesToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSetStatusList }
     *     
     */
    public void setReferencesToAdd(NodeSetStatusList value) {
        this.referencesToAdd = value;
    }

    /**
     * Gets the value of the nodesToDelete property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSetStatusList }
     *     
     */
    public NodeSetStatusList getNodesToDelete() {
        return nodesToDelete;
    }

    /**
     * Sets the value of the nodesToDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSetStatusList }
     *     
     */
    public void setNodesToDelete(NodeSetStatusList value) {
        this.nodesToDelete = value;
    }

    /**
     * Gets the value of the referencesToDelete property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSetStatusList }
     *     
     */
    public NodeSetStatusList getReferencesToDelete() {
        return referencesToDelete;
    }

    /**
     * Sets the value of the referencesToDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSetStatusList }
     *     
     */
    public void setReferencesToDelete(NodeSetStatusList value) {
        this.referencesToDelete = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}