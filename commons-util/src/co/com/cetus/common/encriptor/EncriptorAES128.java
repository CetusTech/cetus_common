/*
 * 
 */
package co.com.cetus.common.encriptor;

import java.io.Serializable;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * The Class EncriptorAES128.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (30/03/2016)
 */
public class EncriptorAES128 extends Encriptor implements Serializable {
  
  private static final long   serialVersionUID = 1L;
                                               
  private static final byte[] keyDefault       = new byte[]{ 'K', '3', 'y', 'D', '3', 'f', 'A', 'U', '1', 'T', 'C', 'E', 't', 'U', '5', 'T' };
                                               
  /** The Constant ALGORITHM. */
  private static final String ALGORITHM        = "AES";
                                               
  /** The Constant ITERATIONS. */
  private static final int    ITERATIONS       = 1;
                                               
  private static final String complement       = "C3tuS@teChN0Lo6Y";;
                                               
  /* (non-Javadoc)
   * @see co.com.cetus.common.encriptor.Encriptor#getValueEncripted(java.lang.String, java.lang.String)
   */
  @Override
  public String getValueEncripted ( String text, String keyValue ) throws Exception {
    Key key = generateKey( keyValue );
    Cipher c = Cipher.getInstance( ALGORITHM );
    c.init( Cipher.ENCRYPT_MODE, key );
    
    String valueToEnc = null;
    for ( int i = 0; i < ITERATIONS; i++ ) {
      valueToEnc = complement + text;
      byte[] encValue = c.doFinal( valueToEnc.getBytes() );
      text = new BASE64Encoder().encode( encValue );
    }
    return text;
  }
  
  /**
   * </p> Gets the value decrypted. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param value the value
   * @param keyValue the key value
   * @return el string
   * @throws Exception the exception
   * @since commons-util (30/03/2016)
   */
  public String getValueDecrypted ( String value, String keyValue ) throws Exception {
    Key key = generateKey( keyValue );
    Cipher c = Cipher.getInstance( ALGORITHM );
    c.init( Cipher.DECRYPT_MODE, key );
    
    String dValue = null;
    String valueToDecrypt = value;
    for ( int i = 0; i < ITERATIONS; i++ ) {
      byte[] decordedValue = new BASE64Decoder().decodeBuffer( valueToDecrypt );
      byte[] decValue = c.doFinal( decordedValue );
      dValue = new String( decValue ).substring( complement.length() );
      valueToDecrypt = dValue;
    }
    return dValue;
  }
  
  /**
   * </p> Generate key. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param keyValue the key value
   * @return el key
   * @throws Exception the exception
   * @since commons-util (30/03/2016)
   */
  private static Key generateKey ( String keyValue ) throws Exception {
    Key key = null;
    byte[] keyValueByte = null;
    if ( keyValue == null || ( keyValue != null && keyValue.isEmpty() ) ) {
      keyValueByte = keyDefault;
    } else {
      keyValueByte = keyValue.getBytes();
    }
    key = new SecretKeySpec( keyValueByte, ALGORITHM );
    
    return key;
  }
}
