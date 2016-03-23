package co.com.cetus.common.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.codec.digest.DigestUtils;

import co.com.cetus.common.dto.ResponseDTO;
import co.com.cetus.common.dto.ResponseWSDTO;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * The Class UtilCommon.
 * 
 * @author Andres Herrera - Cetus Technology
 * @version common-util (20/10/2012)
 */
public class UtilCommon {
  protected static XStream xs = getInstance();
  
  /**
   * Gets the lookup.
   * 
   * @param <T>
   *            the generic type
   * @param context
   *            the context
   * @param pHostRemote
   *            the p host remote
   * @return the lookup
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  
  @SuppressWarnings ( "unchecked" )
  public static < T > T getLookup ( String context, String pHostRemote ) {
    InitialContext ctx = null;
    T t = null;
    try {
      System.out.println( "context=" + context + ", pHostRemote=" + pHostRemote );
      Hashtable< String, Object > jndiProps = new Hashtable< String, Object >();
      //    jndiProps.put( "java.naming.factory.initial", ConstantCommon.JAVA_NAMING_FACTORY_INITIAL );
      //    jndiProps.put( "java.naming.factory.url.pkgs", ConstantCommon.JAVA_NAMING_FACTORY_URL_PKGS );
      jndiProps.put( Context.PROVIDER_URL, pHostRemote );
      jndiProps.put( InitialContext.SECURITY_PRINCIPAL, "" );
      jndiProps.put( InitialContext.SECURITY_CREDENTIALS, "" );
      jndiProps.put( "jboss.naming.client.ejb.context", true );
      jndiProps.put( "jboss.naming.client.connect.options.org.xnio.Options.SASL_POLICY_NOPLAINTEXT", "false" );
      
      ctx = new InitialContext( jndiProps );
      t = ( T ) ctx.lookup( context );
    } catch ( NamingException e ) {
      e.printStackTrace();
    }
    System.out.println( t );
    return t;
  }
  
  /**
   * </p> Obtiene el lookup. </p>
   * 
   * @param <T>
   *            the generic type
   * @param context
   *            the context
   * @return the lookup
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  @SuppressWarnings ( "unchecked" )
  public static < T > T getLookup ( String context ) {
    InitialContext ctx = null;
    T t = null;
    try {
      ctx = new InitialContext();
      t = ( T ) ctx.lookup( context );
    } catch ( NamingException e ) {
    }
    return t;
  }
  
  /**
   * </p> Obtiene el properties. </p>
   * 
   * @param pHostRemote
   *            the p host remote
   * @return the properties
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public Properties getProperties ( String pHostRemote ) {
    try {
      // se crea una instancia a la clase Properties
      Properties propiedades = new Properties();
      // se leen el archivo .properties
      // propiedades.load( getClass().getResourceAsStream(
      // "ejb.properties" ) );
      propiedades.put( "java.naming.factory.initial",
                       ConstantCommon.JAVA_NAMING_FACTORY_INITIAL );
      propiedades.put( "java.naming.factory.url.pkgs",
                       ConstantCommon.JAVA_NAMING_FACTORY_URL_PKGS );
      
      if ( pHostRemote != null ) {
        propiedades.put( "java.naming.provider.url", pHostRemote );
      }
      // si el archivo de propiedades NO esta vacio retornan las propiedes
      // leidas
      if ( !propiedades.isEmpty() ) {
        return propiedades;
      } else {// sino retornara NULL
        return null;
      }
    } catch ( Exception e ) {
      return null;
    }
    
  }
  
  /**
   * </p> Obtiene el property. </p>
   * 
   * @param pFileNameProperties
   *            the p file name properties
   * @param pKey
   *            the p key
   * @return the property
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public static String getProperty ( String pFileNameProperties, String pKey ) {
    ResourceBundle rb = null;
    String valueProperty = null;
    try {
      rb = ResourceBundle.getBundle( pFileNameProperties );
      if ( rb != null ) {
        valueProperty = rb.getString( pKey );
      }
    } catch ( Exception e ) {
      try {
        throw new Exception( "Error obteniendo la propiedad " + pKey
                             + " del properties " + pFileNameProperties );
      } catch ( Exception e1 ) {
      }
    }
    return valueProperty;
  }
  
  /**
   * Encriptar clave.
   * 
   * @param pClave
   *            the p clave
   * @return the string
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public static String encriptarClave ( String pClave ) {
    return DigestUtils.md5Hex( pClave );
  }
  
  /**
   * </p> Creates the message success. </p>
   * 
   * @return el response wsdto
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public static ResponseWSDTO createMessageSUCCESS_WS () {
    ResponseWSDTO lResponseWSDTO = new ResponseWSDTO();
    lResponseWSDTO.setCode( ConstantCommon.WSResponse.CODE_ONE );
    lResponseWSDTO.setStatus( ConstantCommon.WSResponse.STATUS_INFO );
    lResponseWSDTO.setType( ConstantCommon.WSResponse.TYPE_SUCCESS );
    lResponseWSDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_SUCCESS );
    
    return lResponseWSDTO;
  }
  
  /**
   * </p> Creates the message failure. </p>
   * 
   * @return el response wsdto
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public static ResponseWSDTO createMessageFAILURE_WS () {
    ResponseWSDTO lResponseWSDTO = new ResponseWSDTO();
    lResponseWSDTO.setCode( ConstantCommon.WSResponse.CODE_LESS_ONE );
    lResponseWSDTO.setStatus( ConstantCommon.WSResponse.STATUS_ERROR );
    lResponseWSDTO.setType( ConstantCommon.WSResponse.TYPE_FAILURE );
    lResponseWSDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_FAILURE );
    
    return lResponseWSDTO;
  }
  
  public static ResponseWSDTO createMessageFAILURE_WS ( Exception e ) {
    ResponseWSDTO lResponseWSDTO = new ResponseWSDTO();
    lResponseWSDTO.setCode( ConstantCommon.WSResponse.CODE_LESS_ONE );
    lResponseWSDTO.setStatus( ConstantCommon.WSResponse.STATUS_ERROR );
    lResponseWSDTO.setType( ConstantCommon.WSResponse.TYPE_FAILURE );
    lResponseWSDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_FAILURE + ": Detalle [" + e.getMessage() + "]" );
    
    return lResponseWSDTO;
  }
  
  /**
   * </p> Creates the message noresult. </p>
   * 
   * @return el response wsdto
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public static ResponseWSDTO createMessageNORESULT_WS () {
    ResponseWSDTO lResponseWSDTO = new ResponseWSDTO();
    lResponseWSDTO.setCode( ConstantCommon.WSResponse.CODE_ZERO );
    lResponseWSDTO.setStatus( ConstantCommon.WSResponse.STATUS_WARING );
    lResponseWSDTO.setType( ConstantCommon.WSResponse.TYPE_NORESULT );
    lResponseWSDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_NORESULT );
    
    return lResponseWSDTO;
  }
  
  /**
   * </p> Creates the message wron g_ parameters. </p>
   * 
   * @return el response wsdto
   * @author Andres Herrera - Cetus Technology
   * @since common-util (20/10/2012)
   */
  public static ResponseWSDTO createMessageWRONG_PARAMETERS_WS () {
    ResponseWSDTO lResponseWSDTO = new ResponseWSDTO();
    lResponseWSDTO.setCode( ConstantCommon.WSResponse.CODE_LESS_TWO );
    lResponseWSDTO.setStatus( ConstantCommon.WSResponse.STATUS_ERROR );
    lResponseWSDTO.setType( ConstantCommon.WSResponse.TYPE_WRONG_PARAMETERS );
    lResponseWSDTO
                  .setMessage( ConstantCommon.WSResponse.MESSAGE_WRONG_PARAMETERS );
    
    return lResponseWSDTO;
  }
  
  /**
   * </p> String null or empty. </p>
   * 
   * @param string
   *            the string
   * @return true, si el proceso fue exitoso
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (17/04/2012)
   */
  public static boolean stringNullOrEmpty ( String string ) {
    if ( string == null ) return true;
    if ( string.isEmpty() ) return true;
    return false;
  }
  
  public static XStream getInstance () {
    if ( xs == null ) {
      synchronized ( XStream.class )
      {
        if ( xs == null ) {
          xs = new XStream( new DomDriver() );
        }
      }
    }
    return xs;
  }
  
  public static String toXML ( Object obj ) {
    return xs != null ? xs.toXML( obj ) : null;
  }
  
  public static Object fromXML ( String pXml ) {
    return xs != null ? xs.fromXML( pXml ) : null;
  }
  
  /**
   * </p> Create message success. </p>
   *
   * @return el response dto
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (22/09/2013)
   */
  public static ResponseDTO createMessageSUCCESS () {
    ResponseDTO lResponseDTO = new ResponseDTO();
    lResponseDTO.setCode( ConstantCommon.WSResponse.CODE_ONE );
    lResponseDTO.setStatus( ConstantCommon.WSResponse.STATUS_INFO );
    lResponseDTO.setType( ConstantCommon.WSResponse.TYPE_SUCCESS );
    lResponseDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_SUCCESS );
    
    return lResponseDTO;
  }
  
  /**
   * </p> Create message failure. </p>
   *
   * @return el response dto
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (22/09/2013)
   */
  public static ResponseDTO createMessageFAILURE () {
    ResponseDTO lResponseDTO = new ResponseDTO();
    lResponseDTO.setCode( ConstantCommon.WSResponse.CODE_LESS_ONE );
    lResponseDTO.setStatus( ConstantCommon.WSResponse.STATUS_ERROR );
    lResponseDTO.setType( ConstantCommon.WSResponse.TYPE_FAILURE );
    lResponseDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_FAILURE );
    
    return lResponseDTO;
  }
  
  /**
   * </p> Create message failure. </p>
   *
   * @param e the e
   * @return el response dto
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (22/09/2013)
   */
  public static ResponseDTO createMessageFAILURE ( Exception e ) {
    ResponseDTO lResponseDTO = new ResponseDTO();
    lResponseDTO.setCode( ConstantCommon.WSResponse.CODE_LESS_ONE );
    lResponseDTO.setStatus( ConstantCommon.WSResponse.STATUS_ERROR );
    lResponseDTO.setType( ConstantCommon.WSResponse.TYPE_FAILURE );
    lResponseDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_FAILURE + ": Detalle [" + e.getMessage() + "]" );
    
    return lResponseDTO;
  }
  
  /**
   * </p> Create message noresult. </p>
   *
   * @return el response dto
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (22/09/2013)
   */
  public static ResponseDTO createMessageNORESULT () {
    ResponseDTO lResponseDTO = new ResponseDTO();
    lResponseDTO.setCode( ConstantCommon.WSResponse.CODE_ZERO );
    lResponseDTO.setStatus( ConstantCommon.WSResponse.STATUS_WARING );
    lResponseDTO.setType( ConstantCommon.WSResponse.TYPE_NORESULT );
    lResponseDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_NORESULT );
    
    return lResponseDTO;
  }
  
  /**
   * </p> Create message wron g_ parameters. </p>
   *
   * @return el response dto
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (22/09/2013)
   */
  public static ResponseDTO createMessageWRONG_PARAMETERS () {
    ResponseDTO lResponseDTO = new ResponseDTO();
    lResponseDTO.setCode( ConstantCommon.WSResponse.CODE_LESS_TWO );
    lResponseDTO.setStatus( ConstantCommon.WSResponse.STATUS_ERROR );
    lResponseDTO.setType( ConstantCommon.WSResponse.TYPE_WRONG_PARAMETERS );
    lResponseDTO.setMessage( ConstantCommon.WSResponse.MESSAGE_WRONG_PARAMETERS );
    
    return lResponseDTO;
  }
  
  /**
   * </p> Convet response to response ws. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param responseDTO the response dto
   * @return el response wsdto
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (29/09/2013)
   */
  public static ResponseWSDTO convetResponseToResponseWS ( ResponseDTO responseDTO ) {
    ResponseWSDTO responseWSDTO = null;
    if ( responseDTO != null ) {
      responseWSDTO = new ResponseWSDTO();
      responseWSDTO.setCode( responseDTO.getCode() );
      responseWSDTO.setMessage( responseDTO.getMessage() );
      responseWSDTO.setType( responseDTO.getType() );
      responseWSDTO.setStatus( responseDTO.getStatus() );
    }
    return responseWSDTO;
  }
  
  /**
   * </p> Validate response success. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param pResponse the p response
   * @return true, si el proceso fue exitoso
   * @since commons-util (11/12/2014)
   */
  public static boolean validateResponseSuccess ( ResponseDTO pResponse ) {
    if ( pResponse != null && pResponse.getCode() != null && !pResponse.getCode().isEmpty() && pResponse.getType() != null
         && !pResponse.getType().isEmpty()
         && pResponse.getCode().equals( ConstantCommon.WSResponse.CODE_ONE )
         && pResponse.getType().equals( ConstantCommon.WSResponse.TYPE_SUCCESS ) ) {
      return true;
    }
    return false;
  }
  
  public static boolean validateResponseSuccessWithWarning ( ResponseDTO pResponse ) {
    if ( pResponse != null && pResponse.getCode() != null && !pResponse.getCode().isEmpty() && pResponse.getType() != null
         && !pResponse.getType().isEmpty()
         && pResponse.getCode().equals( ConstantCommon.WSResponse.CODE_ZERO )
         && pResponse.getType().equals( ConstantCommon.WSResponse.TYPE_NORESULT ) ) {
      return true;
    }
    return false;
  }
  
  /**
   * </p> Validate response no result. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param pResponse the p response
   * @return true, si el proceso fue exitoso
   * @since commons-util (11/12/2014)
   */
  public static boolean validateResponseNoResult ( ResponseDTO pResponse ) {
    if ( pResponse != null && pResponse.getCode() != null && !pResponse.getCode().isEmpty() && pResponse.getType() != null
         && !pResponse.getType().isEmpty()
         && pResponse.getCode().equals( ConstantCommon.WSResponse.CODE_ZERO )
         && pResponse.getType().equals( ConstantCommon.WSResponse.TYPE_NORESULT ) ) {
      return true;
    }
    return false;
  }
  
  /**
   * </p> Validate response success xml output. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param pResponse the p response
   * @return true, si el proceso fue exitoso
   * @since commons-util (11/12/2014)
   */
  public static boolean validateResponseSuccessXMLOutput ( ResponseDTO pResponse ) {
    if ( pResponse != null && pResponse.getCode() != null && !pResponse.getCode().isEmpty() && pResponse.getType() != null
         && !pResponse.getType().isEmpty()
         && pResponse.getCode().equals( ConstantCommon.WSResponse.CODE_ONE )
         && pResponse.getType().equals( ConstantCommon.WSResponse.TYPE_SUCCESS )
         && pResponse.getObjectResponse() != null ) {
      return true;
    }
    return false;
  }
  
  /**
   * </p> Gets the lookup security. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param <T> the generic type
   * @param context the context
   * @param pHostRemote the p host remote
   * @param user the user
   * @param password the password
   * @return el t
   * @since commons-util (16/12/2014)
   */
  @SuppressWarnings ( "unchecked" )
  public static < T > T getLookupSecurity ( String context, String pHostRemote, String user, String password ) {
    InitialContext ctx = null;
    T t = null;
    try {
      Hashtable< String, Object > jndiProps = new Hashtable< String, Object >();
      //      jndiProps.put( "java.naming.factory.initial", ConstantCommon.JAVA_NAMING_FACTORY_INITIAL );
      //      jndiProps.put( "java.naming.factory.url.pkgs", ConstantCommon.JAVA_NAMING_FACTORY_URL_PKGS );
      jndiProps.put( Context.PROVIDER_URL, pHostRemote );
      jndiProps.put( InitialContext.SECURITY_PRINCIPAL, user );
      jndiProps.put( InitialContext.SECURITY_CREDENTIALS, password );
      jndiProps.put( "jboss.naming.client.ejb.context", true );
      jndiProps.put( "jboss.naming.client.connect.options.org.xnio.Options.SASL_POLICY_NOPLAINTEXT", "false" );
      
      ctx = new InitialContext( jndiProps );
      t = ( T ) ctx.lookup( context );
    } catch ( NamingException e ) {
      e.printStackTrace();
    }
    return t;
  }
  
  public static XMLGregorianCalendar converDateToXMLGregorianCalendar ( Date pFecha ) throws DatatypeConfigurationException {
    GregorianCalendar c = null;
    XMLGregorianCalendar xmlGregorianCalendar = null;
    
    try {
      c = new GregorianCalendar();
      c.setTime( pFecha );
      xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar( c );
    } catch ( DatatypeConfigurationException e ) {
      throw e;
    }
    return xmlGregorianCalendar;
  }

  
}
