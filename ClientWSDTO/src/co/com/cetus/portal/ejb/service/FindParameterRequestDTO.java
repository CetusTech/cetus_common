
package co.com.cetus.portal.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findParameterRequestDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findParameterRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ejb.portal.cetus.com.co/}userWSDTO">
 *       &lt;sequence>
 *         &lt;element name="nameComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idApplication" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findParameterRequestDTO", propOrder = {
    "nameComponent",
    "idApplication"
})
public class FindParameterRequestDTO
    extends UserWSDTO
{

    protected String nameComponent;
    protected int idApplication;

    /**
     * Obtiene el valor de la propiedad nameComponent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameComponent() {
        return nameComponent;
    }

    /**
     * Define el valor de la propiedad nameComponent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameComponent(String value) {
        this.nameComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad idApplication.
     * 
     */
    public int getIdApplication() {
        return idApplication;
    }

    /**
     * Define el valor de la propiedad idApplication.
     * 
     */
    public void setIdApplication(int value) {
        this.idApplication = value;
    }

}
