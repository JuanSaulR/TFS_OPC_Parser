//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.06 at 10:44:03 AM PDT 
//


package org.opcfoundation.ua.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UADataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UADataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Definition" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}DataTypeDefinition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UADataType", propOrder = {
    "definition"
})
public class UADataType
    extends UAType
{

    @XmlElement(name = "Definition")
    protected DataTypeDefinition definition;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeDefinition }
     *     
     */
    public DataTypeDefinition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeDefinition }
     *     
     */
    public void setDefinition(DataTypeDefinition value) {
        this.definition = value;
    }

}