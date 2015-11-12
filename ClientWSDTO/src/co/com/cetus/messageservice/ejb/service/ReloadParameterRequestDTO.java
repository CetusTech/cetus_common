
package co.com.cetus.messageservice.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reloadParameterRequestDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reloadParameterRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ejb.messageservice.cetus.com.co/}userWSDTO">
 *       &lt;sequence>
 *         &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reloadParameterRequestDTO", propOrder = {
    "component",
    "listParameter"
})
public class ReloadParameterRequestDTO
    extends UserWSDTO
{

    protected String component;
    protected String listParameter;

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the listParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListParameter() {
        return listParameter;
    }

    /**
     * Sets the value of the listParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListParameter(String value) {
        this.listParameter = value;
    }

}
