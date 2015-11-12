package co.com.cetus.messageservice.ejb.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import co.com.cetus.common.dto.ReloadParameterRequestDTO;
import co.com.cetus.common.dto.ResponseWSDTO;
import co.com.cetus.common.util.UtilCommon;
import co.com.cetus.messageservice.ejb.dto.SendMailRequestDTO;
import co.com.cetus.messageservice.ejb.interceptor.ValidatePermissionInterceptor;
import co.com.cetus.messageservice.ejb.process.CetusMessageProcess;
import co.com.cetus.messageservice.ejb.util.ConstantEJB;

@Stateless
@WebService
public class CetusMessageService {
  
  @EJB
  CetusMessageProcess cetusMessageProcess;
  
  public CetusMessageService () {
  }
  
  /**
   * </p> Reload parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param reloadParameterDTO the reload parameter dto
   * @return el response wsdto
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  @Interceptors ( ValidatePermissionInterceptor.class )
  @WebMethod
  public @WebResult ( name = "responseWSDTO" ) ResponseWSDTO
      reloadParameter ( @WebParam ( name = "reloadParameterRequestDTO" ) ReloadParameterRequestDTO reloadParameterDTO ) {
    ResponseWSDTO responseWSDTO = null;
    try {
      responseWSDTO = cetusMessageProcess.reloadParameter( reloadParameterDTO );
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
      responseWSDTO = UtilCommon.createMessageFAILURE_WS();
    }
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
  @Interceptors ( ValidatePermissionInterceptor.class )
  @WebMethod
  public @WebResult ( name = "responseWSDTO" ) ResponseWSDTO
      sendEmail ( @WebParam ( name = "sendMailRequestDTO" ) SendMailRequestDTO sendMailRequestDTO ) {
    ResponseWSDTO responseWSDTO = null;
    try {
      responseWSDTO = cetusMessageProcess.sendEmail( sendMailRequestDTO );
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
      responseWSDTO = UtilCommon.createMessageFAILURE_WS();
    }
    return responseWSDTO;
  }
  
}
