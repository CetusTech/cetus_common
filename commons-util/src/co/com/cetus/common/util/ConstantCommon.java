package co.com.cetus.common.util;

/**
 * 
 * @author Jose David Salcedo Mandon - Cetus Technology
 */
public interface ConstantCommon {
  
  /** The CONJUNCION. */
  public static final String CONJUNCION                   = "1";
  
  /** The DISYUNCION. */
  public static final String DISYUNCION                   = "2";
  
  /** The TIP o_ asc. */
  public static final String TIPO_ASC                     = "1";
  
  /** The TIP o_ desc. */
  public static final String TIPO_DESC                    = "2";
  
  /** The USUARI o_ general. */
  public static final String USUARIO_GENERAL              = "PUBLIC";
  
  /** The Constant VALOR_COMBOS_NEUTRO. */
  public static final String VALOR_COMBOS_NEUTRO          = null;
  
  public String              ACTIVO                       = "ACTIVO";
  public String              INACTIVO                     = "INACTIVO";
  
  String                     JAVA_NAMING_FACTORY_INITIAL  = "org.jboss.naming.remote.client.InitialContextFactory";
  String                     JAVA_NAMING_FACTORY_URL_PKGS = "org.jboss.naming:org.jnp.interfaces";
  
  public interface WSResponse {
    String CODE_ONE                 = "01";
    String CODE_ZERO                = "00";
    String CODE_LESS_ONE            = "-1";
    String CODE_LESS_TWO            = "-2";
    
    String TYPE_FAILURE             = "FAILURE";
    String TYPE_SUCCESS             = "SUCCESS";
    String TYPE_WRONG_PARAMETERS    = "WRONG_PARAMETERS";
    String TYPE_NORESULT            = "NORESULT";
    
    String STATUS_INFO              = "INFO";
    String STATUS_WARING            = "WARNING";
    String STATUS_ERROR             = "ERROR";
    
    String MESSAGE_NORESULT         = "No se encontraron registros para la consulta realizada. ";
    String MESSAGE_SUCCESS          = "Termino correctamente la acci\u00f3n solicitada.";
    String MESSAGE_FAILURE          = "Ocurri\u00f3 un error al ejecutar el servicio. ";
    String MESSAGE_WRONG_PARAMETERS = "Los parametros de entrada no cumplen con la validaci\u00f3n del servicio. ";
  }
  
}
