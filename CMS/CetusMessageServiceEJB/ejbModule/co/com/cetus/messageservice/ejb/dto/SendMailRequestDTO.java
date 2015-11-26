package co.com.cetus.messageservice.ejb.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import co.com.cetus.common.dto.UserWSDTO;

/**
 * The Class SendMailRequestDTO.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (23/07/2015)
 */
@XmlRootElement()
@XmlAccessorType ( XmlAccessType.FIELD )
public class SendMailRequestDTO extends UserWSDTO implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @XmlElement ( required = true )
  private String            recipients[];
  
  @XmlElement ( required = false )
  private String            copyToRecipients[];
  
  @XmlElement ( required = true )
  private String            subject;
  
  @XmlElement ( required = true )
  private String            senderEmail;
  
  @XmlElement ( required = false )
  private String            senderName;
  
  @XmlElement ( required = true )
  private String            senderPassword;
  
  @XmlElement ( required = true )
  private String            serverSmtp;
  
  @XmlElement ( required = true )
  private String            serverPort;
  
  @XmlElement ( required = false )
  private byte[]            attached1;
  
  @XmlElement ( required = false )
  private byte[]            attached2;
  
  @XmlElement ( required = false )
  private byte[]            attached3;
  
  @XmlElement ( required = false )
  private String            nameFileAttached[];
  
  @XmlElement ( required = false )
  private String            nameTemplateHTML;
  
  @XmlElement ( required = false )
  private String            parametersTemplateHTML[];
  
  @XmlElement ( required = false )
  private String            message;
  
  public SendMailRequestDTO () {
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
  
  public String getSubject () {
    return subject;
  }
  
  public void setSubject ( String subject ) {
    this.subject = subject;
  }
  
  public String getSenderEmail () {
    return senderEmail;
  }
  
  public void setSenderEmail ( String senderEmail ) {
    this.senderEmail = senderEmail;
  }
  
  public String getSenderName () {
    return senderName;
  }
  
  public void setSenderName ( String senderName ) {
    this.senderName = senderName;
  }
  
  public String getSenderPassword () {
    return senderPassword;
  }
  
  public void setSenderPassword ( String senderPassword ) {
    this.senderPassword = senderPassword;
  }
  
  public String getServerSmtp () {
    return serverSmtp;
  }
  
  public void setServerSmtp ( String serverSmtp ) {
    this.serverSmtp = serverSmtp;
  }
  
  public String getServerPort () {
    return serverPort;
  }
  
  public void setServerPort ( String serverPort ) {
    this.serverPort = serverPort;
  }
  
  public byte[] getAttached1 () {
    return attached1;
  }
  
  public void setAttached1 ( byte[] attached1 ) {
    this.attached1 = attached1;
  }
  
  public byte[] getAttached2 () {
    return attached2;
  }
  
  public void setAttached2 ( byte[] attached2 ) {
    this.attached2 = attached2;
  }
  
  public byte[] getAttached3 () {
    return attached3;
  }
  
  public void setAttached3 ( byte[] attached3 ) {
    this.attached3 = attached3;
  }
  
  public String[] getNameFileAttached () {
    return nameFileAttached;
  }
  
  public void setNameFileAttached ( String[] nameFileAttached ) {
    this.nameFileAttached = nameFileAttached;
  }
  
  public String getNameTemplateHTML () {
    return nameTemplateHTML;
  }
  
  public void setNameTemplateHTML ( String nameTemplateHTML ) {
    this.nameTemplateHTML = nameTemplateHTML;
  }
  
  public String[] getParametersTemplateHTML () {
    return parametersTemplateHTML;
  }
  
  public void setParametersTemplateHTML ( String[] parametersTemplateHTML ) {
    this.parametersTemplateHTML = parametersTemplateHTML;
  }
  
  public String getMessage () {
    return message;
  }
  
  public void setMessage ( String message ) {
    this.message = message;
  }
 
}
