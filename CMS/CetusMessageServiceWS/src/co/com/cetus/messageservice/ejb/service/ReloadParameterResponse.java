
package co.com.cetus.messageservice.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reloadParameterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reloadParameterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseWSDTO" type="{http://service.ejb.messageservice.cetus.com.co/}responseWSDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reloadParameterResponse", propOrder = {
    "responseWSDTO"
})
public class ReloadParameterResponse {

    @XmlElement(name = "ResponseWSDTO")
    protected ResponseWSDTO responseWSDTO;

    /**
     * Gets the value of the responseWSDTO property.
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
     * Sets the value of the responseWSDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseWSDTO }
     *     
     */
    public void setResponseWSDTO(ResponseWSDTO value) {
        this.responseWSDTO = value;
    }

}
