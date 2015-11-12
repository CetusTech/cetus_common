package co.com.cetus.messageservice.ejb.mail;

import javax.mail.PasswordAuthentication;

/**
 * The Class SMTPAuthentication.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (25/07/2015)
 */
class SMTPAuthentication extends javax.mail.Authenticator {
  
  /** The user name. */
  private String userName;
  
  /** The password. */
  private String password;
  
  /**
   * </p> Instancia un nuevo SMTP authentication. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param pUsername the p username
   * @param pPassword the p password
   * @since CetusMessageServiceEJB (25/07/2015)
   */
  public SMTPAuthentication ( String pUsername, String pPassword ) {
    this.userName = pUsername;
    this.password = pPassword;
  }
  
  /* (non-Javadoc)
   * @see javax.mail.Authenticator#getPasswordAuthentication()
   */
  public PasswordAuthentication getPasswordAuthentication () {
    return new PasswordAuthentication( userName, password );
  }
}