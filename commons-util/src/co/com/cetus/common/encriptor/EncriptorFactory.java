package co.com.cetus.common.encriptor;

import java.io.Serializable;

/**
 * Factoria para la creacion de objetos Encriptor.
 */
public class EncriptorFactory implements Serializable {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /**
   * Crea un nuevo objeto Encriptor.
   *
   * @param tipo the tipo
   * @return the encriptor
   */
  public static Encriptor createEncriptor ( EncriptorType tipo ) throws Exception {
    Encriptor encriptor = null;
    if ( tipo == EncriptorType.MD5 ) {
      encriptor = new EncriptorMD5();
    } else if ( tipo == EncriptorType.AES128 ) {
      encriptor = new EncriptorAES128();
    }
    return encriptor;
  }
  
}
