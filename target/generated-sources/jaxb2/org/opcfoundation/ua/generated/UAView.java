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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UAView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UAView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}UAInstance"&gt;
 *       &lt;attribute name="ContainsNoLoops" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="EventNotifier" type="{http://opcfoundation.org/UA/2011/03/UANodeSet.xsd}EventNotifier" default="0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UAView")
public class UAView
    extends UAInstance
{

    @XmlAttribute(name = "ContainsNoLoops")
    protected Boolean containsNoLoops;
    @XmlAttribute(name = "EventNotifier")
    protected Short eventNotifier;

    /**
     * Gets the value of the containsNoLoops property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContainsNoLoops() {
        if (containsNoLoops == null) {
            return false;
        } else {
            return containsNoLoops;
        }
    }

    /**
     * Sets the value of the containsNoLoops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsNoLoops(Boolean value) {
        this.containsNoLoops = value;
    }

    /**
     * Gets the value of the eventNotifier property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getEventNotifier() {
        if (eventNotifier == null) {
            return ((short) 0);
        } else {
            return eventNotifier;
        }
    }

    /**
     * Sets the value of the eventNotifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEventNotifier(Short value) {
        this.eventNotifier = value;
    }

}