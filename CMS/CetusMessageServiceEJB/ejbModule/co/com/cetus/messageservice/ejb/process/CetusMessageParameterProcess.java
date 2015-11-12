package co.com.cetus.messageservice.ejb.process;

import static co.com.cetus.common.util.UtilCommon.createMessageFAILURE;
import static co.com.cetus.common.util.UtilCommon.createMessageSUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

import co.com.cetus.common.dto.ParameterDTO;
import co.com.cetus.common.dto.ResponseDTO;
import co.com.cetus.common.util.ConstantCommon;
import co.com.cetus.common.util.UtilCommon;
import co.com.cetus.messageservice.ejb.delegate.CetusVortalDelegate;
import co.com.cetus.messageservice.ejb.util.ConstantEJB;
import co.com.cetus.portal.ejb.service.FindParameterRequestDTO;
import co.com.cetus.portal.ejb.service.FindParameterResponseDTO;

/**
 * The Class CetusMessageParameterProcess.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (22/07/2015)
 */
@Singleton
@Lock ( LockType.READ )
public class CetusMessageParameterProcess {
  
  /** The cetus vortal delegate. */
  private CetusVortalDelegate cetusVortalDelegate;
  
  /**
   * </p> Instancia un nuevo cetus message parameter process. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public CetusMessageParameterProcess () {
    cetusVortalDelegate = new CetusVortalDelegate();
  }
  
  /**
   * </p> Reload parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param listParameter the list parameter
   * @return el response dto
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public ResponseDTO reloadParameter ( List< ParameterDTO > listParameter ) {
    ResponseDTO responseDTO = null;
    try {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Inicia el re cargue de los parametros de Cetus Message Service..." );
      if ( ConstantEJB.loadParameter( listParameter ) ) {
        responseDTO = UtilCommon.createMessageSUCCESS();
      } else {
        responseDTO = UtilCommon.createMessageFAILURE();
      }
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
      responseDTO = UtilCommon.createMessageFAILURE();
      responseDTO.setMessage( responseDTO.getMessage() + "-" + e.getMessage() );
      
    }
    ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Inicia el re cargue de los parametros de Cetus Message Service..." );
    return responseDTO;
  }
  
  /**
   * </p> Load parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  private void loadParameter () {
    List< co.com.cetus.portal.ejb.service.ParameterDTO > list = null;
    co.com.cetus.portal.ejb.service.ResponseWSDTO responseWSDTO = null;
    FindParameterResponseDTO findResponseDTO = null;
    FindParameterRequestDTO findParameterRequestDTO = new FindParameterRequestDTO();
    List< ParameterDTO > listParameter = new ArrayList< ParameterDTO >();
    ParameterDTO parameterDTO = null;
    try {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Inicia el cargue de los parametros de Cetus Message Service..." );
      
      findParameterRequestDTO.setUser( ConstantEJB.USER_WS_CETUS );
      findParameterRequestDTO.setPassword( ConstantEJB.PASSWORD_WS_CETUS );
      findParameterRequestDTO.setIdApplication( ConstantEJB.ID_APPLICATION_CETUS );
      findParameterRequestDTO.setNameComponent( ConstantEJB.CETUS_MESSAGE_EJB_COMPONENT );
      
      findResponseDTO = cetusVortalDelegate.findParameter( findParameterRequestDTO );
      responseWSDTO = findResponseDTO.getResponseWSDTO();
      if ( responseWSDTO != null && responseWSDTO.getCode().equals( ConstantCommon.WSResponse.CODE_ONE ) ) {
        list = findResponseDTO.getParameters();
        for ( co.com.cetus.portal.ejb.service.ParameterDTO parameter: list ) {
          parameterDTO = new ParameterDTO( parameter.getName(), parameter.getValue() );
          listParameter.add( parameterDTO );
        }
        if ( ConstantEJB.loadParameter( listParameter ) ) {
          ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Parametros cargados exitosamente" );
        }
      }
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
    ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Finaliza el cargue de los parametros de Cetus Message Service..." );
  }
  
  /**
   * </p> Gets the value parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param nameParameter the name parameter
   * @return el string
   * @since CetusMessageServiceEJB (23/07/2015)
   */
  public String getValueParameter ( String nameParameter ) {
    String valueParameter = null;
    try {
      if ( ConstantEJB.parameter == null ) {
        loadParameter();
      }
      valueParameter = ConstantEJB.getParameter( nameParameter );
      
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
    return valueParameter;
  }
}
