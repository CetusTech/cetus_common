
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
 * <p>Clase Java para menuDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="menuDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acronimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tbAplicationServlet" type="{http://service.ejb.portal.cetus.com.co/}aplicationServletDTO" minOccurs="0"/>
 *         &lt;element name="tbMenu" type="{http://service.ejb.portal.cetus.com.co/}menuDTO" minOccurs="0"/>
 *         &lt;element name="tbMenus" type="{http://service.ejb.portal.cetus.com.co/}menuDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tbRolMenus" type="{http://service.ejb.portal.cetus.com.co/}rolMenuDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuDTO", propOrder = {
    "acronimo",
    "descripcion",
    "fechaCreacion",
    "id",
    "nombre",
    "tbAplicationServlet",
    "tbMenu",
    "tbMenus",
    "tbRolMenus",
    "url",
    "usuarioCreacion"
})
public class MenuDTO {

    protected String acronimo;
    protected String descripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    protected int id;
    protected String nombre;
    protected AplicationServletDTO tbAplicationServlet;
    protected MenuDTO tbMenu;
    @XmlElement(nillable = true)
    protected List<MenuDTO> tbMenus;
    @XmlElement(nillable = true)
    protected List<RolMenuDTO> tbRolMenus;
    protected String url;
    protected String usuarioCreacion;

    /**
     * Obtiene el valor de la propiedad acronimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronimo() {
        return acronimo;
    }

    /**
     * Define el valor de la propiedad acronimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronimo(String value) {
        this.acronimo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tbAplicationServlet.
     * 
     * @return
     *     possible object is
     *     {@link AplicationServletDTO }
     *     
     */
    public AplicationServletDTO getTbAplicationServlet() {
        return tbAplicationServlet;
    }

    /**
     * Define el valor de la propiedad tbAplicationServlet.
     * 
     * @param value
     *     allowed object is
     *     {@link AplicationServletDTO }
     *     
     */
    public void setTbAplicationServlet(AplicationServletDTO value) {
        this.tbAplicationServlet = value;
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
     * Gets the value of the tbRolMenus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbRolMenus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbRolMenus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolMenuDTO }
     * 
     * 
     */
    public List<RolMenuDTO> getTbRolMenus() {
        if (tbRolMenus == null) {
            tbRolMenus = new ArrayList<RolMenuDTO>();
        }
        return this.tbRolMenus;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioCreacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * Define el valor de la propiedad usuarioCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCreacion(String value) {
        this.usuarioCreacion = value;
    }

}
