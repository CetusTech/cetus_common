package co.com.cetus.messageservice.ws.facade;

import java.net.URL;

import javax.xml.namespace.QName;

import co.com.cetus.messageservice.ejb.service.CetusMessageService;
import co.com.cetus.messageservice.ejb.service.CetusMessageServiceService;
import co.com.cetus.messageservice.ejb.service.ResponseWSDTO;
import co.com.cetus.messageservice.ejb.service.SendMailRequestDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class CetusMessageServiceFacade.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceWS (9/09/2015)
 */
public class CetusMessageServiceFacade {
  
  /** The service. */
  private CetusMessageServiceService service                     = null;
  
  /** The port. */
  private CetusMessageService        port                        = null;
  
  /** The Constant CETUS_CUSTOMER_SERVICE_QNAME. */
  private final static QName         CETUS_MESSAGE_SERVICE_QNAME = new QName( "http://service.ejb.messageservice.cetus.com.co/",
                                                                              "CetusMessageServiceService" );
  
  /**
   * </p> Instancia un nuevo cetus message service facade. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param urlWS the url ws
   * @since CetusMessageServiceWS (9/09/2015)
   */
  public CetusMessageServiceFacade ( URL urlWS ) {
    try {
      if ( urlWS != null ) {
        service = new CetusMessageServiceService( urlWS, CETUS_MESSAGE_SERVICE_QNAME );
      } else {
        //WSDL por defecto
        service = new CetusMessageServiceService();
      }
      port = service.getCetusMessageServicePort();
    } catch ( Exception e ) {
      e.printStackTrace();
    }
    
  }
  
  
  /**
   * </p> Send email. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param request the request
   * @return el response wsdto
   * @since CetusMessageServiceWS (9/09/2015)
   */
  public ResponseWSDTO sendEmail ( SendMailRequestDTO request ) {
    return port.sendEmail( request );
    
  }
  
}
