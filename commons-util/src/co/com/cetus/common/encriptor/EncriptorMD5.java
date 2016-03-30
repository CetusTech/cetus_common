package co.com.cetus.common.encriptor;

import java.io.Serializable;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * The Class EncriptorMD5.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (30/03/2016)
 */
public class EncriptorMD5 extends Encriptor implements Serializable {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;


  /* (non-Javadoc)
   * @see co.com.cetus.common.encriptor.Encriptor#getValueEncripted(java.lang.String, java.lang.String)
   */
  @Override
  public String getValueEncripted(String value, String key) throws Exception {
    try {
      String valueEncripted = DigestUtils.md5Hex( value );
      return valueEncripted;
    } catch (Exception e) {
      throw new Exception("Error al encriptar en MD5 el valor:" + value);
    }
  }


  /* (non-Javadoc)
   * @see co.com.cetus.common.encriptor.Encriptor#getValueDecrypted(java.lang.String, java.lang.String)
   */
  @Override
  public String getValueDecrypted ( String value, String key ) throws Exception {
    return null;
  }

}
