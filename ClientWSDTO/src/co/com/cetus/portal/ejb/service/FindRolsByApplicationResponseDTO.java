
package co.com.cetus.portal.ejb.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findRolsByApplicationResponseDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findRolsByApplicationResponseDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseWSDTO" type="{http://service.ejb.portal.cetus.com.co/}responseWSDTO" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://service.ejb.portal.cetus.com.co/}rolDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findRolsByApplicationResponseDTO", propOrder = {
    "responseWSDTO",
    "rol"
})
public class FindRolsByApplicationResponseDTO {

    protected ResponseWSDTO responseWSDTO;
    @XmlElement(nillable = true)
    protected List<RolDTO> rol;

    /**
     * Obtiene el valor de la propiedad responseWSDTO.
     * 
     * @return
     *     possible object is
     *     {@link ResponseWSDTO }
     *     
     */
    public ResponseWSDTO getResponseWSDTO() {
        return responseWSDTO;
    }

    /**
     * Define el valor de la propiedad responseWSDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseWSDTO }
     *     
     */
    public void setResponseWSDTO(ResponseWSDTO value) {
        this.responseWSDTO = value;
    }

    /**
     * Gets the value of the rol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolDTO }
     * 
     * 
     */
    public List<RolDTO> getRol() {
        if (rol == null) {
            rol = new ArrayList<RolDTO>();
        }
        return this.rol;
    }

}
