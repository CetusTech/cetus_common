
package co.com.cetus.portal.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createUserResponseDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createUserResponseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://service.ejb.portal.cetus.com.co/}responseWSDTO" minOccurs="0"/>
 *         &lt;element name="usuarioDTO" type="{http://service.ejb.portal.cetus.com.co/}userDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUserResponseDTO", propOrder = {
    "response",
    "usuarioDTO"
})
public class CreateUserResponseDTO {

    protected ResponseWSDTO response;
    protected UserDTO usuarioDTO;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link ResponseWSDTO }
     *     
     */
    public ResponseWSDTO getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseWSDTO }
     *     
     */
    public void setResponse(ResponseWSDTO value) {
        this.response = value;
    }

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

}
