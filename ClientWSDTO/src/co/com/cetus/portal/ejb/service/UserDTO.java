package co.com.cetus.portal.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para userDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="userDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginOld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usuarioCreacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType ( XmlAccessType.FIELD )
@XmlType ( name = "userDTO", propOrder = {
                                          "address",
                                          "descripcion",
                                          "email",
                                          "fechaCreacion",
                                          "id",
                                          "identificacion",
                                          "login",
                                          "loginOld",
                                          "password",
                                          "phone",
                                          "status",
                                          "usuarioCreacion"
} )
public class UserDTO {
  
  protected String               address;
  protected String               descripcion;
  protected String               email;
  @XmlSchemaType ( name = "dateTime" )
  protected XMLGregorianCalendar fechaCreacion;
  protected int                  id;
  protected String               identificacion;
  protected String               login;
  protected String               loginOld;
  protected String               password;
  protected String               phone;
  protected int                  status;
  protected String               usuarioCreacion;
  
  /**
   * Obtiene el valor de la propiedad address.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getAddress () {
    return address;
  }
  
  /**
   * Define el valor de la propiedad address.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setAddress ( String value ) {
    this.address = value;
  }
  
  /**
   * Obtiene el valor de la propiedad descripcion.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getDescripcion () {
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
  public void setDescripcion ( String value ) {
    this.descripcion = value;
  }
  
  /**
   * Obtiene el valor de la propiedad email.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getEmail () {
    return email;
  }
  
  /**
   * Define el valor de la propiedad email.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setEmail ( String value ) {
    this.email = value;
  }
  
  /**
   * Obtiene el valor de la propiedad fechaCreacion.
   * 
   * @return
   *     possible object is
   *     {@link XMLGregorianCalendar }
   *     
   */
  public XMLGregorianCalendar getFechaCreacion () {
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
  public void setFechaCreacion ( XMLGregorianCalendar value ) {
    this.fechaCreacion = value;
  }
  
  /**
   * Obtiene el valor de la propiedad id.
   * 
   */
  public int getId () {
    return id;
  }
  
  /**
   * Define el valor de la propiedad id.
   * 
   */
  public void setId ( int value ) {
    this.id = value;
  }
  
  /**
   * Obtiene el valor de la propiedad identificacion.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getIdentificacion () {
    return identificacion;
  }
  
  /**
   * Define el valor de la propiedad identificacion.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setIdentificacion ( String value ) {
    this.identificacion = value;
  }
  
  /**
   * Obtiene el valor de la propiedad login.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getLogin () {
    return login;
  }
  
  /**
   * Define el valor de la propiedad login.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setLogin ( String value ) {
    this.login = value;
  }
  
  /**
   * Obtiene el valor de la propiedad loginOld.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getLoginOld () {
    return loginOld;
  }
  
  /**
   * Define el valor de la propiedad loginOld.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setLoginOld ( String value ) {
    this.loginOld = value;
  }
  
  /**
   * Obtiene el valor de la propiedad password.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getPassword () {
    return password;
  }
  
  /**
   * Define el valor de la propiedad password.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setPassword ( String value ) {
    this.password = value;
  }
  
  /**
   * Obtiene el valor de la propiedad phone.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getPhone () {
    return phone;
  }
  
  /**
   * Define el valor de la propiedad phone.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setPhone ( String value ) {
    this.phone = value;
  }
  
  /**
   * Obtiene el valor de la propiedad status.
   * 
   */
  public int getStatus () {
    return status;
  }
  
  /**
   * Define el valor de la propiedad status.
   * 
   */
  public void setStatus ( int value ) {
    this.status = value;
  }
  
  /**
   * Obtiene el valor de la propiedad usuarioCreacion.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getUsuarioCreacion () {
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
  public void setUsuarioCreacion ( String value ) {
    this.usuarioCreacion = value;
  }
  
}
