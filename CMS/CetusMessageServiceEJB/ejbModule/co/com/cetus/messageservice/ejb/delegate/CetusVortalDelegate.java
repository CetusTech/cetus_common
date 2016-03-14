package co.com.cetus.messageservice.ejb.delegate;

import java.net.MalformedURLException;
import java.net.URL;

import co.com.cetus.portal.ejb.service.ResponseWSDTO;
import co.com.cetus.messageservice.ejb.util.ConstantEJB;
import co.com.cetus.portal.ejb.service.FindParameterRequestDTO;
import co.com.cetus.portal.ejb.service.FindParameterResponseDTO;
import co.com.cetus.portal.ejb.service.ValidPermServiceRequestDTO;
import co.com.cetus.servicie.facade.CustomerServiceFacade;

/**
 * The Class CetusVortalDelegate.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (22/07/2015)
 */
public class CetusVortalDelegate {
  /** The customer service. */
  private CustomerServiceFacade customerService;
  
  public CetusVortalDelegate () {
    init();
  }
  
  /**
   * </p> Inits the. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  private void init () {
    try {
      customerService = new CustomerServiceFacade( new URL( ConstantEJB.WSDL_CETUS_CUSTOMER_SERVICE ) );
//      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "####### CustomerService Instanciado Correctamente" );
    } catch ( MalformedURLException e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
  }
  
  /**
   * </p> Find parameter. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param findParameterRequestDTO the find parameter request dto
   * @return el find parameter response dto
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public FindParameterResponseDTO findParameter ( FindParameterRequestDTO findParameterRequestDTO ) {
    FindParameterResponseDTO findParameterResponseDTO = null;
    try {
      findParameterResponseDTO = customerService.findParameter( findParameterRequestDTO );
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
    return findParameterResponseDTO;
  }
  
  /**
   * </p> Valid permission service. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param validPermServiceRequestDTO the valid perm service request dto
   * @return el response wsdto
   * @since CetusMessageServiceEJB (22/07/2015)
   */
  public ResponseWSDTO validPermissionService ( ValidPermServiceRequestDTO validPermServiceRequestDTO ) {
    ResponseWSDTO responseWSDTO = null;
    try {
      responseWSDTO = customerService.validPermissionService( validPermServiceRequestDTO );
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
    return responseWSDTO;
  }
  
}
