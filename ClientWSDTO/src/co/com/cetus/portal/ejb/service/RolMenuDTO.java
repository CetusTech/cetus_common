
package co.com.cetus.portal.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolMenuDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolMenuDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tbMenu" type="{http://service.ejb.portal.cetus.com.co/}menuDTO" minOccurs="0"/>
 *         &lt;element name="tbRol" type="{http://service.ejb.portal.cetus.com.co/}rolDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolMenuDTO", propOrder = {
    "id",
    "tbMenu",
    "tbRol"
})
public class RolMenuDTO {

    protected int id;
    protected MenuDTO tbMenu;
    protected RolDTO tbRol;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad tbMenu.
     * 
     * @return
     *     possible object is
     *     {@link MenuDTO }
     *     
     */
    public MenuDTO getTbMenu() {
        return tbMenu;
    }

    /**
     * Define el valor de la propiedad tbMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuDTO }
     *     
     */
    public void setTbMenu(MenuDTO value) {
        this.tbMenu = value;
    }

    /**
     * Obtiene el valor de la propiedad tbRol.
     * 
     * @return
     *     possible object is
     *     {@link RolDTO }
     *     
     */
    public RolDTO getTbRol() {
        return tbRol;
    }

    /**
     * Define el valor de la propiedad tbRol.
     * 
     * @param value
     *     allowed object is
     *     {@link RolDTO }
     *     
     */
    public void setTbRol(RolDTO value) {
        this.tbRol = value;
    }

}
