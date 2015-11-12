package co.com.cetus.messageservice.ejb.util;

import java.util.ResourceBundle;

/**
 * The Class UtilEJB.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (22/07/2015)
 */
public class UtilEJB {
  
  /**
   * </p> Gets the property. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param nameProperties the name properties
   * @param nameProperty the name property
   * @return el string
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public static String getProperty ( String nameProperties, String nameProperty ) {
    ResourceBundle rb = null;
    String valueProperty = null;
    try {
      rb = ResourceBundle.getBundle( nameProperties );
      if ( rb != null ) {
        valueProperty = rb.getString( nameProperty );
      }
      
    } catch ( Exception e ) {
      try {
        throw new Exception( "Error obteniendo la propiedad " + nameProperty + " del properties " + nameProperties );
      } catch ( Exception e1 ) {
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( "Propiedad " + nameProperty + "=" + valueProperty, e1 );
      }
    }
    return valueProperty;
  }
  
}
