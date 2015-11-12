package co.com.cetus.common.dto;

import java.io.Serializable;

/**
 * The Class ReloadParameterRequestDTO.
 *
 * @author Jose David Salcedo Mandon - Cetus Technology
 * @version common-util (28/09/2013)
 */
public class ReloadParameterRequestDTO extends UserWSDTO implements Serializable {
  
  private static final long serialVersionUID = 1L;
  private String            component;
  private String            listParameter;
  
  public ReloadParameterRequestDTO () {
  }
  
  public String getComponent () {
    return component;
  }
  
  public void setComponent ( String component ) {
    this.component = component;
  }
  
  public String getListParameter () {
    return listParameter;
  }
  
  public void setListParameter ( String listParameter ) {
    this.listParameter = listParameter;
  }
  
}
