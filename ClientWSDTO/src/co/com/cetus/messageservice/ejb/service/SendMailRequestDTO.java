
package co.com.cetus.messageservice.ejb.service;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for sendMailRequestDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMailRequestDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.ejb.messageservice.cetus.com.co/}userWSDTO">
 *       &lt;sequence>
 *         &lt;element name="recipients" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="copyToRecipients" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attached1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attached2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attached3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="nameFileAttached" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameTemplateHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametersTemplateHTML" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType ( XmlAccessType.FIELD )
@XmlType ( name = "sendMailRequestDTO", propOrder = {
                                                      "recipients",
                                                      "copyToRecipients",
                                                      "subject",
                                                      "attached1",
                                                      "attached2",
                                                      "attached3",
                                                      "nameFileAttached",
                                                      "nameTemplateHTML",
                                                      "parametersTemplateHTML",
                                                      "message"
} )
public class SendMailRequestDTO
                                extends UserWSDTO {
                                
  @XmlElement ( required = true )
  protected String[] recipients;
  protected String[] copyToRecipients;
  @XmlElement ( required = true )
  protected String   subject;
  protected byte[]   attached1;
  protected byte[]   attached2;
  protected byte[]   attached3;
  protected String[] nameFileAttached;
  protected String   nameTemplateHTML;
  protected String[] parametersTemplateHTML;
  protected String   message;
                     
  /**
   * Gets the value of the subject property.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getSubject () {
    return subject;
  }
  
  /**
   * Sets the value of the subject property.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setSubject ( String value ) {
    this.subject = value;
  }
  
  /**
   * Gets the value of the attached1 property.
   * 
   * @return
   *     possible object is
   *     byte[]
   */
  public byte[] getAttached1 () {
    return attached1;
  }
  
  /**
   * Sets the value of the attached1 property.
   * 
   * @param value
   *     allowed object is
   *     byte[]
   */
  public void setAttached1 ( byte[] value ) {
    this.attached1 = ( ( byte[] ) value );
  }
  
  /**
   * Gets the value of the attached2 property.
   * 
   * @return
   *     possible object is
   *     byte[]
   */
  public byte[] getAttached2 () {
    return attached2;
  }
  
  /**
   * Sets the value of the attached2 property.
   * 
   * @param value
   *     allowed object is
   *     byte[]
   */
  public void setAttached2 ( byte[] value ) {
    this.attached2 = ( ( byte[] ) value );
  }
  
  /**
   * Gets the value of the attached3 property.
   * 
   * @return
   *     possible object is
   *     byte[]
   */
  public byte[] getAttached3 () {
    return attached3;
  }
  
  /**
   * Sets the value of the attached3 property.
   * 
   * @param value
   *     allowed object is
   *     byte[]
   */
  public void setAttached3 ( byte[] value ) {
    this.attached3 = ( ( byte[] ) value );
  }
  
  /**
   * Gets the value of the nameTemplateHTML property.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getNameTemplateHTML () {
    return nameTemplateHTML;
  }
  
  /**
   * Sets the value of the nameTemplateHTML property.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setNameTemplateHTML ( String value ) {
    this.nameTemplateHTML = value;
  }
  
  /**
   * Gets the value of the message property.
   * 
   * @return
   *     possible object is
   *     {@link String }
   *     
   */
  public String getMessage () {
    return message;
  }
  
  /**
   * Sets the value of the message property.
   * 
   * @param value
   *     allowed object is
   *     {@link String }
   *     
   */
  public void setMessage ( String value ) {
    this.message = value;
  }
  
  public String[] getRecipients () {
    return recipients;
  }
  
  public void setRecipients ( String[] recipients ) {
    this.recipients = recipients;
  }
  
  public String[] getCopyToRecipients () {
    return copyToRecipients;
  }
  
  public void setCopyToRecipients ( String[] copyToRecipients ) {
    this.copyToRecipients = copyToRecipients;
  }
  
  public String[] getNameFileAttached () {
    return nameFileAttached;
  }
  
  public void setNameFileAttached ( String[] nameFileAttached ) {
    this.nameFileAttached = nameFileAttached;
  }
  
  public String[] getParametersTemplateHTML () {
    return parametersTemplateHTML;
  }
  
  public void setParametersTemplateHTML ( String[] parametersTemplateHTML ) {
    this.parametersTemplateHTML = parametersTemplateHTML;
  }
  
  @Override
  public String toString () {
    return "SendMailRequestDTO [recipients=" + Arrays.toString( recipients ) + ", copyToRecipients=" + Arrays.toString( copyToRecipients )
           + ", subject=" + subject + ", attached1=" + attached1 + ", attached2=" + attached2 + ", attached3="
           + attached3 + ", nameFileAttached=" + Arrays.toString( nameFileAttached ) + ", nameTemplateHTML=" + nameTemplateHTML
           + ", parametersTemplateHTML=" + Arrays.toString( parametersTemplateHTML ) + ", message=" + message + "]";
  }
  
}
