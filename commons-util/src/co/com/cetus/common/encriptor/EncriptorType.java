package co.com.cetus.common.encriptor;

import java.io.Serializable;

/**
 * The Enum EncriptorType.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (30/03/2016)
 */
public enum EncriptorType implements Serializable {
  
  MD5 ( "MD5", "Encriptacion MD5" ), 
 AES128 ( "AES128", "Encriptacion AES128" );
  
  /** The value. */
  private String value;
  
  /** The description. */
  private String description;
                 
  /**
   * </p> Instancia un nuevo encriptor type. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param value the value
   * @param description the description
   * @since commons-util (30/03/2016)
   */
  private EncriptorType ( String value, String description ) {
    this.value = value;
    this.description = description;
  }
  
  /**
   * </p> Gets the value. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @return el string
   * @since commons-util (30/03/2016)
   */
  public String getValue () {
    return value;
  }
  
  /**
   * </p> Sets the value. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param value the value
   * @since commons-util (30/03/2016)
   */
  public void setValue ( String value ) {
    this.value = value;
  }
  
  /**
   * </p> Gets the description. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @return el string
   * @since commons-util (30/03/2016)
   */
  public String getDescription () {
    return description;
  }
  
  /**
   * </p> Sets the description. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param description the description
   * @since commons-util (30/03/2016)
   */
  public void setDescription ( String description ) {
    this.description = description;
  }
  
}
