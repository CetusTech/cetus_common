
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
 * <p>Clase Java para rolDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tbRolMenus" type="{http://service.ejb.portal.cetus.com.co/}rolMenuDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tbUsuarioRols" type="{http://service.ejb.portal.cetus.com.co/}usuarioRolDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "rolDTO", propOrder = {
    "descripcion",
    "fechaCreacion",
    "id",
    "tbRolMenus",
    "tbUsuarioRols",
    "usuarioCreacion"
})
public class RolDTO {

    protected String descripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    protected int id;
    @XmlElement(nillable = true)
    protected List<RolMenuDTO> tbRolMenus;
    @XmlElement(nillable = true)
    protected List<UsuarioRolDTO> tbUsuarioRols;
    protected String usuarioCreacion;

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
     * Gets the value of the tbUsuarioRols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbUsuarioRols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbUsuarioRols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioRolDTO }
     * 
     * 
     */
    public List<UsuarioRolDTO> getTbUsuarioRols() {
        if (tbUsuarioRols == null) {
            tbUsuarioRols = new ArrayList<UsuarioRolDTO>();
        }
        return this.tbUsuarioRols;
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
