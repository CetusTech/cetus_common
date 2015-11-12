package co.com.cetus.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The Class ParameterDTO.
 *
 * @author Jose David Salcedo Mandon - Cetus Technology
 * @version common-util (29/09/2013)
 */
@XmlRootElement
@XmlAccessorType ( XmlAccessType.FIELD )
public class ParameterDTO implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private String            name;
  private String            value;
  
  public ParameterDTO () {
  }
  
  public ParameterDTO (String name, String value) {
    this.name = name;
    this.value = value;
  }
  
  public String getName () {
    return name;
  }
  
  public void setName ( String name ) {
    this.name = name;
  }
  
  public String getValue () {
    return value;
  }
  
  public void setValue ( String value ) {
    this.value = value;
  }

  @Override
  public String toString () {
    return "ParameterDTO [name=" + name + ", value=" + value + "]";
  }
  
}
