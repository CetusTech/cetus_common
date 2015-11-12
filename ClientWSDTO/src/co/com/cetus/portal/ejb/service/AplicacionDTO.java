
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
 * <p>Clase Java para aplicacionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aplicacionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colorRgb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imagenCuerpo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tbAplicationServlets" type="{http://service.ejb.portal.cetus.com.co/}aplicationServletDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tbComponents" type="{http://service.ejb.portal.cetus.com.co/}componentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tbService" type="{http://service.ejb.portal.cetus.com.co/}serviceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tbTipoEstilo" type="{http://service.ejb.portal.cetus.com.co/}tipoEstiloDTO" minOccurs="0"/>
 *         &lt;element name="urlServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "aplicacionDTO", propOrder = {
    "colorRgb",
    "descripcion",
    "fechaCreacion",
    "id",
    "imagenCuerpo",
    "logo",
    "nombre",
    "tbAplicationServlets",
    "tbComponents",
    "tbService",
    "tbTipoEstilo",
    "urlServer",
    "usuarioCreacion"
})
public class AplicacionDTO {

    protected String colorRgb;
    protected String descripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    protected int id;
    protected byte[] imagenCuerpo;
    protected byte[] logo;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<AplicationServletDTO> tbAplicationServlets;
    @XmlElement(nillable = true)
    protected List<ComponentDTO> tbComponents;
    @XmlElement(nillable = true)
    protected List<ServiceDTO> tbService;
    protected TipoEstiloDTO tbTipoEstilo;
    protected String urlServer;
    protected String usuarioCreacion;

    /**
     * Obtiene el valor de la propiedad colorRgb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorRgb() {
        return colorRgb;
    }

    /**
     * Define el valor de la propiedad colorRgb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorRgb(String value) {
        this.colorRgb = value;
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
     * Obtiene el valor de la propiedad imagenCuerpo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenCuerpo() {
        return imagenCuerpo;
    }

    /**
     * Define el valor de la propiedad imagenCuerpo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenCuerpo(byte[] value) {
        this.imagenCuerpo = value;
    }

    /**
     * Obtiene el valor de la propiedad logo.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogo() {
        return logo;
    }

    /**
     * Define el valor de la propiedad logo.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogo(byte[] value) {
        this.logo = value;
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
     * Gets the value of the tbAplicationServlets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbAplicationServlets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbAplicationServlets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AplicationServletDTO }
     * 
     * 
     */
    public List<AplicationServletDTO> getTbAplicationServlets() {
        if (tbAplicationServlets == null) {
            tbAplicationServlets = new ArrayList<AplicationServletDTO>();
        }
        return this.tbAplicationServlets;
    }

    /**
     * Gets the value of the tbComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentDTO }
     * 
     * 
     */
    public List<ComponentDTO> getTbComponents() {
        if (tbComponents == null) {
            tbComponents = new ArrayList<ComponentDTO>();
        }
        return this.tbComponents;
    }

    /**
     * Gets the value of the tbService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDTO }
     * 
     * 
     */
    public List<ServiceDTO> getTbService() {
        if (tbService == null) {
            tbService = new ArrayList<ServiceDTO>();
        }
        return this.tbService;
    }

    /**
     * Obtiene el valor de la propiedad tbTipoEstilo.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstiloDTO }
     *     
     */
    public TipoEstiloDTO getTbTipoEstilo() {
        return tbTipoEstilo;
    }

    /**
     * Define el valor de la propiedad tbTipoEstilo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstiloDTO }
     *     
     */
    public void setTbTipoEstilo(TipoEstiloDTO value) {
        this.tbTipoEstilo = value;
    }

    /**
     * Obtiene el valor de la propiedad urlServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlServer() {
        return urlServer;
    }

    /**
     * Define el valor de la propiedad urlServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlServer(String value) {
        this.urlServer = value;
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
