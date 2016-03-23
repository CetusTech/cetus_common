
package co.com.cetus.cetuscontrol.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reloadParameterRequestDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reloadParameterRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ejb.cetuscontrol.cetus.com.co/}userWSDTO">
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
     * Obtiene el valor de la propiedad component.
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
     * Define el valor de la propiedad component.
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
     * Obtiene el valor de la propiedad listParameter.
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
     * Define el valor de la propiedad listParameter.
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
