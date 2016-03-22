package co.com.cetus.common.mail;

import javax.mail.PasswordAuthentication;

/**
 * 
 * @author Andres
 */
@Deprecated
class SMTPAuthentication extends javax.mail.Authenticator {
  private String userName;
  private String password;
  
  public SMTPAuthentication ( String pUsername, String pPassword ) {
    this.userName = pUsername;
    this.password = pPassword;
  }
  
  public PasswordAuthentication getPasswordAuthentication () {
    return new PasswordAuthentication( userName, password );
  }
}