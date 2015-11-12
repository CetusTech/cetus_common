
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
 * <p>Clase Java para serviceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tbAplicacion" type="{http://service.ejb.portal.cetus.com.co/}aplicacionDTO" minOccurs="0"/>
 *         &lt;element name="tbPermissions" type="{http://service.ejb.portal.cetus.com.co/}permissionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsdl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceDTO", propOrder = {
    "dateCreation",
    "dateUpdate",
    "id",
    "name",
    "status",
    "tbAplicacion",
    "tbPermissions",
    "userCreation",
    "userUpdate",
    "wsdl"
})
public class ServiceDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdate;
    protected int id;
    protected String name;
    protected int status;
    protected AplicacionDTO tbAplicacion;
    @XmlElement(nillable = true)
    protected List<PermissionDTO> tbPermissions;
    protected String userCreation;
    protected String userUpdate;
    protected String wsdl;

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
     * Obtiene el valor de la propiedad dateUpdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdate() {
        return dateUpdate;
    }

    /**
     * Define el valor de la propiedad dateUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdate(XMLGregorianCalendar value) {
        this.dateUpdate = value;
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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
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
     * Gets the value of the tbPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionDTO }
     * 
     * 
     */
    public List<PermissionDTO> getTbPermissions() {
        if (tbPermissions == null) {
            tbPermissions = new ArrayList<PermissionDTO>();
        }
        return this.tbPermissions;
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

    /**
     * Obtiene el valor de la propiedad userUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUpdate() {
        return userUpdate;
    }

    /**
     * Define el valor de la propiedad userUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUpdate(String value) {
        this.userUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad wsdl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdl() {
        return wsdl;
    }

    /**
     * Define el valor de la propiedad wsdl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdl(String value) {
        this.wsdl = value;
    }

}
