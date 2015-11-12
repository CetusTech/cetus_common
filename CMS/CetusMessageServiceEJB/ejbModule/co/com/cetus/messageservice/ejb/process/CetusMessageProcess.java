package co.com.cetus.messageservice.ejb.process;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

import co.com.cetus.common.dto.ParameterDTO;
import co.com.cetus.common.dto.ReloadParameterRequestDTO;
import co.com.cetus.common.dto.ResponseDTO;
import co.com.cetus.common.dto.ResponseWSDTO;
import co.com.cetus.common.exception.ValidatorException;
import co.com.cetus.common.util.UtilCommon;
import co.com.cetus.messageservice.ejb.dto.SendMailRequestDTO;
import co.com.cetus.messageservice.ejb.mail.SendMail;
import co.com.cetus.messageservice.ejb.util.ConstantEJB;
import co.com.cetus.messageservice.ejb.validator.CetusMessageValidator;

/**
 * The Class CetusMessageProcess.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (23/07/2015)
 */
@Singleton
@Lock ( LockType.READ )
public class CetusMessageProcess {
  
  @EJB
  CetusMessageParameterProcess cetusMParameterProcess;
  
  public CetusMessageProcess () {
  }
  
  /**
   * </p> Reload parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param reloadParameterDTO the reload parameter dto
   * @return el response wsdto
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  @SuppressWarnings ( "unchecked" )
  public ResponseWSDTO reloadParameter ( ReloadParameterRequestDTO reloadParameterDTO ) {
    ResponseWSDTO responseWSDTO = null;
    ResponseDTO responseDTO = null;
    List< ParameterDTO > listParameter = null;
    try {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "********* Inicia recarga el componente [" + reloadParameterDTO.getComponent() + "] *********" );
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "Component =" + reloadParameterDTO.getComponent() + ", ListParameter ="
                                              + reloadParameterDTO.getListParameter() );
      
      CetusMessageValidator.componentIsNullOrEmpty( reloadParameterDTO.getComponent() );
      CetusMessageValidator.listParameterIsNullOrEmpty( reloadParameterDTO.getListParameter() );
      
      listParameter = ( List< ParameterDTO > ) UtilCommon.fromXML( reloadParameterDTO.getListParameter() );
      
      if ( ConstantEJB.CETUS_MESSAGE_EJB_COMPONENT.equals( reloadParameterDTO.getComponent() ) ) {
        if ( listParameter == null ) {
          listParameter = new ArrayList< ParameterDTO >();
        }
        responseDTO = cetusMParameterProcess.reloadParameter( listParameter );
        
        if ( responseDTO != null ) {
          responseWSDTO = UtilCommon.convetResponseToResponseWS( responseDTO );
        } else {
          responseWSDTO = UtilCommon.createMessageFAILURE_WS();
        }
      } else {
        responseWSDTO = UtilCommon.createMessageWRONG_PARAMETERS_WS();
        responseWSDTO.setMessage( ConstantEJB.NO_EXISTS_COMPONENT );
      }
    } catch ( ValidatorException ve ) {
      responseWSDTO = UtilCommon.createMessageWRONG_PARAMETERS_WS();
      responseWSDTO.setMessage( ve.getMessage() );
      
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
      responseWSDTO = UtilCommon.createMessageFAILURE_WS();
    }
    ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "********* Finaliza recarga el componente [" + reloadParameterDTO.getComponent() + "] *********" );
    return responseWSDTO;
  }
  
  /**
   * </p> Send email. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param sendMailRequestDTO the send mail request dto
   * @return el response wsdto
   * @since CetusMessageServiceEJB (25/07/2015)
   */
  public ResponseWSDTO sendEmail ( SendMailRequestDTO sendMailRequestDTO ) {
    ResponseWSDTO responseWSDTO = null;
    String message = null;
    String valueParameter = null;
    String nameParameterMessage = null;
    try {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "********** [INICIO] sendEmail **********" );
      CetusMessageValidator.recipientsIsNullOrEmpty( sendMailRequestDTO.getRecipients() );
      CetusMessageValidator.subjectIsNullOrEmpty( sendMailRequestDTO.getSubject() );
      CetusMessageValidator.senderEmailIsNullOrEmpty( sendMailRequestDTO.getSenderEmail() );
      CetusMessageValidator.senderPasswordIsNullOrEmpty( sendMailRequestDTO.getSenderPassword() );
      CetusMessageValidator.serverSmtpIsNullOrEmpty( sendMailRequestDTO.getServerSmtp() );
      CetusMessageValidator.serverPortIsNullOrEmpty( sendMailRequestDTO.getServerPort() );
      
      if ( sendMailRequestDTO.getNameTemplateHTML() != null && !sendMailRequestDTO.getNameTemplateHTML().isEmpty() ) {
        valueParameter = cetusMParameterProcess.getValueParameter( sendMailRequestDTO.getNameTemplateHTML() );
        if( valueParameter != null ){
          message = valueParameter;
          if( sendMailRequestDTO.getParametersTemplateHTML() != null && sendMailRequestDTO.getParametersTemplateHTML().length > 0 ){
            for ( int i = 0; i < sendMailRequestDTO.getParametersTemplateHTML().length; i++ ) {
              nameParameterMessage = "{"+ (i + 1) +"}";
              message.replaceAll( nameParameterMessage, sendMailRequestDTO.getParametersTemplateHTML()[i] );
            }
          }
        }else{
          message = new String("");
        }
      } else {
        CetusMessageValidator.messageIsNullOrEmpty( sendMailRequestDTO.getMessage() );
        message = sendMailRequestDTO.getMessage();
      }
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "Finaliza la validacion de parametros" );
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "Se procede a enviar el correo..." );
      if( SendMail.send( sendMailRequestDTO ) ){
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "Correo enviado exitosamente" );
        responseWSDTO = UtilCommon.createMessageSUCCESS_WS();
      }else{
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( "Error enviando el correo" );
        responseWSDTO = UtilCommon.createMessageFAILURE_WS();
      }
      
    } catch ( ValidatorException ve ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( ve.getMessage() );
      responseWSDTO = UtilCommon.createMessageWRONG_PARAMETERS_WS();
      responseWSDTO.setMessage( ve.getMessage() );
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
      responseWSDTO = UtilCommon.createMessageFAILURE_WS();
    }
    ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "********** [FIN] sendEmail **********" );
    return responseWSDTO;
  }
  
}
