package co.com.cetus.common.encriptor;

import java.io.Serializable;

/**
 * The Class Encriptor.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (30/03/2016)
 */
public abstract class Encriptor implements Serializable {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /**
   * </p> Gets the value encripted. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param value the value
   * @param key the key
   * @return el string
   * @throws Exception the exception
   * @since commons-util (30/03/2016)
   */
  public abstract String getValueEncripted ( String value, String key ) throws Exception;
  
  /**
   * </p> Gets the value decrypted. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param value the value
   * @param key the key
   * @return el string
   * @throws Exception the exception
   * @since commons-util (30/03/2016)
   */
  public abstract String getValueDecrypted ( String value, String key ) throws Exception;
}
