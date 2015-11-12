package co.com.cetus.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class UserWSDTO.
 *
 * @author Jose David Salcedo Mandon - Cetus Technology
 * @version common-util (22/09/2013)
 */
@SuppressWarnings ( "serial" )
@XmlRootElement
@XmlAccessorType ( XmlAccessType.FIELD )
public class UserWSDTO implements Serializable {
  
  @XmlElement(required=true)
  private String   user;
  @XmlElement(required=true)
  private String   password;
  
  public String getUser () {
    return user;
  }
  public void setUser ( String user ) {
    this.user = user;
  }
  public String getPassword () {
    return password;
  }
  public void setPassword ( String password ) {
    this.password = password;
  }
  
    
}
