package co.com.cetus.messageservice.ejb.util;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;

import co.com.cetus.common.dto.ParameterDTO;

/**
 * The Class ConstantEJB.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (22/07/2015)
 */
public class ConstantEJB {
  
  public static Logger                    CETUS_MESSAGE_EJB_LOG            = Logger.getLogger( "CetusMessageServiceEJB" );
  
  public static PropertiesLoader          properties                       = PropertiesLoader.getInstance();
  
  public static String                    WSDL_CETUS_CUSTOMER_SERVICE      = properties.getProperty( "WSDL_CETUS_CUSTOMER_SERVICE" );
  public static String                    USER_WS_CETUS                    = properties.getProperty( "USER_WS_CETUS" );
  public static String                    PASSWORD_WS_CETUS                = properties.getProperty( "PASSWORD_WS_CETUS" );
  public static int                       ID_APPLICATION_CETUS             = Integer.parseInt( properties.getProperty( "ID_APPLICATION_CETUS",
                                                                                                                       "1" ) );
  public static String                    CETUS_MESSAGE_EJB_COMPONENT      = properties.getProperty( "CETUS_MESSAGE_EJB_COMPONENT" );
  public static String                    NO_PERMISSION_SERVICE            = properties.getProperty( "NO_PERMISSION_SERVICE" );
  public static String                    NO_EXISTS_COMPONENT              = properties.getProperty( "NO_EXISTS_COMPONENT" );
  
  public final static String              NAME_BUNDLE_NEGOCIO              = "CetusMessageServiceEJB";
  public static String                    COMPONENT_IS_NULL_OR_EMPTY       = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO, "COMPONENT_IS_NULL_OR_EMPTY" );
  public static String                    LIST_PARAMETER_IS_NULL_OR_EMPTY  = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO,
                                                                                                  "LIST_PARAMETER_IS_NULL_OR_EMPTY" );
  public static String                    RECIPIENTS_IS_NULL_OR_EMPTY      = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO, "RECIPIENTS_IS_NULL_OR_EMPTY" );
  public static String                    SUBJECT_IS_NULL_OR_EMPTY         = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO, "SUBJECT_IS_NULL_OR_EMPTY" );
  public static String                    SENDER_EMAIL_IS_NULL_OR_EMPTY    = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO,
                                                                                                  "SENDER_EMAIL_IS_NULL_OR_EMPTY" );
  public static String                    SENDER_PASSWORD_IS_NULL_OR_EMPTY = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO,
                                                                                                  "SENDER_PASSWORD_IS_NULL_OR_EMPTY" );
  public static String                    SERVER_SMTP_IS_NULL_OR_EMPTY     = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO, "SERVER_SMTP_IS_NULL_OR_EMPTY" );
  public static String                    SERVER_PORT_IS_NULL_OR_EMPTY     = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO, "SERVER_PORT_IS_NULL_OR_EMPTY" );
  
  public static String                    MESSAGE_IS_NULL_OR_EMPTY         = UtilEJB.getProperty( NAME_BUNDLE_NEGOCIO, "MESSAGE_IS_NULL_OR_EMPTY" );
  
  public static HashMap< String, String > parameter                        = null;
  
  /**
   * </p> Load parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param list the list
   * @return true, si el proceso fue exitoso
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public static boolean loadParameter ( List< ParameterDTO > list ) {
    boolean result = false;
    try {
      if ( list != null ) {
        parameter = new HashMap< String, String >();
        if ( list != null && list.size() > 0 ) {
          for ( ParameterDTO parametro: list ) {
            ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( parametro.toString() );
            parameter.put( parametro.getName(), parametro.getValue() );
          }
        }
        result = true;
      }
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
      result = false;
    }
    return result;
  }
  
  /**
   * </p> Gets the parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param nameParam the name param
   * @return el string
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public static String getParameter ( String nameParam ) {
    String valueParameter = null;
    try {
      if ( parameter != null ) {
        valueParameter = parameter.get( nameParam );
      }
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
    return valueParameter;
  }
  
}
