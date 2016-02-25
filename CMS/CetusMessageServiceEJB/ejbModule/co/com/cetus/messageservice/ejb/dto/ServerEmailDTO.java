package co.com.cetus.messageservice.ejb.dto;

public class ServerEmailDTO {
  
  private String serverSmtp;
  private String serverPort;
  private String senderEmail;
  private String senderPassword;
  private String senderName;
                 
  public ServerEmailDTO () {
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
  
  public String getSenderEmail () {
    return senderEmail;
  }
  
  public void setSenderEmail ( String senderEmail ) {
    this.senderEmail = senderEmail;
  }
  
  public String getSenderPassword () {
    return senderPassword;
  }
  
  public void setSenderPassword ( String senderPassword ) {
    this.senderPassword = senderPassword;
  }
  
  public String getSenderName () {
    return senderName;
  }
  
  public void setSenderName ( String senderName ) {
    this.senderName = senderName;
  }
  
}
