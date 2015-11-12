
package co.com.cetus.messageservice.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reloadParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reloadParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reloadParameterRequestDTO" type="{http://service.ejb.messageservice.cetus.com.co/}reloadParameterRequestDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reloadParameter", propOrder = {
    "reloadParameterRequestDTO"
})
public class ReloadParameter {

    protected ReloadParameterRequestDTO reloadParameterRequestDTO;

    /**
     * Gets the value of the reloadParameterRequestDTO property.
     * 
     * @return
     *     possible object is
     *     {@link ReloadParameterRequestDTO }
     *     
     */
    public ReloadParameterRequestDTO getReloadParameterRequestDTO() {
        return reloadParameterRequestDTO;
    }

    /**
     * Sets the value of the reloadParameterRequestDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReloadParameterRequestDTO }
     *     
     */
    public void setReloadParameterRequestDTO(ReloadParameterRequestDTO value) {
        this.reloadParameterRequestDTO = value;
    }

}
