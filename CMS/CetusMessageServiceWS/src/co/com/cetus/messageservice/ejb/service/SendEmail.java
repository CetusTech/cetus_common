
package co.com.cetus.messageservice.ejb.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendEmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendEmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://service.ejb.messageservice.cetus.com.co/}sendMailRequestDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmail", propOrder = {
    "sendMailRequestDTO"
})
public class SendEmail {

    @XmlElement(namespace = "http://service.ejb.messageservice.cetus.com.co/")
    protected SendMailRequestDTO sendMailRequestDTO;

    /**
     * Gets the value of the sendMailRequestDTO property.
     * 
     * @return
     *     possible object is
     *     {@link SendMailRequestDTO }
     *     
     */
    public SendMailRequestDTO getSendMailRequestDTO() {
        return sendMailRequestDTO;
    }

    /**
     * Sets the value of the sendMailRequestDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMailRequestDTO }
     *     
     */
    public void setSendMailRequestDTO(SendMailRequestDTO value) {
        this.sendMailRequestDTO = value;
    }

}
