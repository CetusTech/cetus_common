
package co.com.cetus.portal.ejb.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para aplicationServletDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aplicationServletDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tbAplicacion" type="{http://service.ejb.portal.cetus.com.co/}aplicacionDTO" minOccurs="0"/>
 *         &lt;element name="tbMenus" type="{http://service.ejb.portal.cetus.com.co/}menuDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tbServlet" type="{http://service.ejb.portal.cetus.com.co/}servletDTO" minOccurs="0"/>
 *         &lt;element name="userCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aplicationServletDTO", propOrder = {
    "dateCreation",
    "id",
    "tbAplicacion",
    "tbMenus",
    "tbServlet",
    "userCreation"
})
public class AplicationServletDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    protected int id;
    protected AplicacionDTO tbAplicacion;
    @XmlElement(nillable = true)
    protected List<MenuDTO> tbMenus;
    protected ServletDTO tbServlet;
    protected String userCreation;

    /**
     * Obtiene el valor de la propiedad dateCreation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreation() {
        return dateCreation;
    }

    /**
     * Define el valor de la propiedad dateCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreation(XMLGregorianCalendar value) {
        this.dateCreation = value;
    }

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
     * Obtiene el valor de la propiedad tbAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link AplicacionDTO }
     *     
     */
    public AplicacionDTO getTbAplicacion() {
        return tbAplicacion;
    }

    /**
     * Define el valor de la propiedad tbAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link AplicacionDTO }
     *     
     */
    public void setTbAplicacion(AplicacionDTO value) {
        this.tbAplicacion = value;
    }

    /**
     * Gets the value of the tbMenus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbMenus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbMenus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuDTO }
     * 
     * 
     */
    public List<MenuDTO> getTbMenus() {
        if (tbMenus == null) {
            tbMenus = new ArrayList<MenuDTO>();
        }
        return this.tbMenus;
    }

    /**
     * Obtiene el valor de la propiedad tbServlet.
     * 
     * @return
     *     possible object is
     *     {@link ServletDTO }
     *     
     */
    public ServletDTO getTbServlet() {
        return tbServlet;
    }

    /**
     * Define el valor de la propiedad tbServlet.
     * 
     * @param value
     *     allowed object is
     *     {@link ServletDTO }
     *     
     */
    public void setTbServlet(ServletDTO value) {
        this.tbServlet = value;
    }

    /**
     * Obtiene el valor de la propiedad userCreation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCreation() {
        return userCreation;
    }

    /**
     * Define el valor de la propiedad userCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCreation(String value) {
        this.userCreation = value;
    }

}
