package co.com.cetus.messageservice.ejb.validator;

import co.com.cetus.common.exception.ValidatorException;
import co.com.cetus.common.util.UtilCommon;
import co.com.cetus.messageservice.ejb.util.ConstantEJB;

/**
 * The Class CetusMessageValidator.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (22/07/2015)
 */
public class CetusMessageValidator {
  
  public CetusMessageValidator () {
  }
  
  public static void componentIsNullOrEmpty ( String component ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( component ) ) throw new ValidatorException( ConstantEJB.COMPONENT_IS_NULL_OR_EMPTY,
                                                                                   "CetusMessageValidator" );
  }
  
  public static void listParameterIsNullOrEmpty ( String listParameter ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( listParameter ) ) throw new ValidatorException( ConstantEJB.LIST_PARAMETER_IS_NULL_OR_EMPTY,
                                                                                       "CetusMessageValidator" );
  }
  
  public static void recipientsIsNullOrEmpty ( String[] recipients ) throws ValidatorException {
    if ( recipients == null || recipients.length == 0 ) throw new ValidatorException( ConstantEJB.RECIPIENTS_IS_NULL_OR_EMPTY,
                                                                                      "CetusMessageValidator" );
  }
  
  public static void subjectIsNullOrEmpty ( String subject ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( subject ) ) throw new ValidatorException( ConstantEJB.SUBJECT_IS_NULL_OR_EMPTY,
                                                                                 "CetusMessageValidator" );
  }
  
  public static void senderEmailIsNullOrEmpty ( String senderEmail ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( senderEmail ) ) throw new ValidatorException( ConstantEJB.SENDER_EMAIL_IS_NULL_OR_EMPTY,
                                                                                 "CetusMessageValidator" );
  }
  
  public static void senderPasswordIsNullOrEmpty ( String senderPassword ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( senderPassword ) ) throw new ValidatorException( ConstantEJB.SENDER_PASSWORD_IS_NULL_OR_EMPTY,
                                                                                 "CetusMessageValidator" );
  }
  
  public static void serverSmtpIsNullOrEmpty ( String serverSmtp ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( serverSmtp ) ) throw new ValidatorException( ConstantEJB.SERVER_SMTP_IS_NULL_OR_EMPTY,
                                                                                 "CetusMessageValidator" );
  }
  
  public static void serverPortIsNullOrEmpty ( String serverPort ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( serverPort ) ) throw new ValidatorException( ConstantEJB.SERVER_PORT_IS_NULL_OR_EMPTY,
                                                                                 "CetusMessageValidator" );
  }
  
  public static void messageIsNullOrEmpty ( String message ) throws ValidatorException {
    if ( UtilCommon.stringNullOrEmpty( message ) ) throw new ValidatorException( ConstantEJB.MESSAGE_IS_NULL_OR_EMPTY,
                                                                                 "CetusMessageValidator" );
  }
  
}
