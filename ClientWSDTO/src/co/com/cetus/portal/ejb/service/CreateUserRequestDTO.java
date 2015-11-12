
package co.com.cetus.portal.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createUserRequestDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createUserRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ejb.portal.cetus.com.co/}userWSDTO">
 *       &lt;sequence>
 *         &lt;element name="usuarioDTO" type="{http://service.ejb.portal.cetus.com.co/}userDTO" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserRequestDTO", propOrder = {
    "usuarioDTO",
    "rol"
})
public class CreateUserRequestDTO
    extends UserWSDTO
{

    protected UserDTO usuarioDTO;
    protected String rol;

    /**
     * Obtiene el valor de la propiedad usuarioDTO.
     * 
     * @return
     *     possible object is
     *     {@link UserDTO }
     *     
     */
    public UserDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    /**
     * Define el valor de la propiedad usuarioDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *     
     */
    public void setUsuarioDTO(UserDTO value) {
        this.usuarioDTO = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

}
