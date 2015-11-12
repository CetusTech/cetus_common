package co.com.cetus.common.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginDTO.
 *
 * @author Andres Herrera - Cetus Technology
 * @version commons-util (9/11/2015)
 */
public class LoginDTO implements Serializable {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -4308827127445086318L;
  
  /** The login. */
  private String            login;
  
  /** The password. */
  private String            password;
  
  /**
   * </p> Gets the login. </p>
   *
   * @author Andres Herrera - Cetus Technology
   * @return el string
   * @since commons-util (9/11/2015)
   */
  public String getLogin() {
    return login;
  }
  
  /**
   * </p> Sets the login. </p>
   *
   * @author Andres Herrera - Cetus Technology
   * @param login the login
   * @since commons-util (9/11/2015)
   */
  public void setLogin( String login ) {
    this.login = login;
  }
  
  /**
   * </p> Gets the password. </p>
   *
   * @author Andres Herrera - Cetus Technology
   * @return el string
   * @since commons-util (9/11/2015)
   */
  public String getPassword() {
    return password;
  }
  
  /**
   * </p> Sets the password. </p>
   *
   * @author Andres Herrera - Cetus Technology
   * @param password the password
   * @since commons-util (9/11/2015)
   */
  public void setPassword( String password ) {
    this.password = password;
  }
  
  /**
   * </p> Gets the serialversionuid. </p>
   *
   * @author Andres Herrera - Cetus Technology
   * @return el long
   * @since commons-util (9/11/2015)
   */
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
  
}
