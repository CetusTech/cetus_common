
package co.com.cetus.messageservice.ejb.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.cetus.messageservice.ejb.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserWSDTO_QNAME = new QName("http://service.ejb.messageservice.cetus.com.co/", "userWSDTO");
    private final static QName _SendEmailResponse_QNAME = new QName("http://service.ejb.messageservice.cetus.com.co/", "sendEmailResponse");
    private final static QName _ReloadParameter_QNAME = new QName("http://service.ejb.messageservice.cetus.com.co/", "reloadParameter");
    private final static QName _SendMailRequestDTO_QNAME = new QName("http://service.ejb.messageservice.cetus.com.co/", "sendMailRequestDTO");
    private final static QName _SendEmail_QNAME = new QName("http://service.ejb.messageservice.cetus.com.co/", "sendEmail");
    private final static QName _ReloadParameterResponse_QNAME = new QName("http://service.ejb.messageservice.cetus.com.co/", "reloadParameterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.cetus.messageservice.ejb.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseWSDTO }
     * 
     */
    public ResponseWSDTO createResponseWSDTO() {
        return new ResponseWSDTO();
    }

    /**
     * Create an instance of {@link ReloadParameterResponse }
     * 
     */
    public ReloadParameterResponse createReloadParameterResponse() {
        return new ReloadParameterResponse();
    }

    /**
     * Create an instance of {@link ReloadParameter }
     * 
     */
    public ReloadParameter createReloadParameter() {
        return new ReloadParameter();
    }

    /**
     * Create an instance of {@link SendMailRequestDTO }
     * 
     */
    public SendMailRequestDTO createSendMailRequestDTO() {
        return new SendMailRequestDTO();
    }

    /**
     * Create an instance of {@link UserWSDTO }
     * 
     */
    public UserWSDTO createUserWSDTO() {
        return new UserWSDTO();
    }

    /**
     * Create an instance of {@link ReloadParameterRequestDTO }
     * 
     */
    public ReloadParameterRequestDTO createReloadParameterRequestDTO() {
        return new ReloadParameterRequestDTO();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserWSDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ejb.messageservice.cetus.com.co/", name = "userWSDTO")
    public JAXBElement<UserWSDTO> createUserWSDTO(UserWSDTO value) {
        return new JAXBElement<UserWSDTO>(_UserWSDTO_QNAME, UserWSDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ejb.messageservice.cetus.com.co/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ejb.messageservice.cetus.com.co/", name = "reloadParameter")
    public JAXBElement<ReloadParameter> createReloadParameter(ReloadParameter value) {
        return new JAXBElement<ReloadParameter>(_ReloadParameter_QNAME, ReloadParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailRequestDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ejb.messageservice.cetus.com.co/", name = "sendMailRequestDTO")
    public JAXBElement<SendMailRequestDTO> createSendMailRequestDTO(SendMailRequestDTO value) {
        return new JAXBElement<SendMailRequestDTO>(_SendMailRequestDTO_QNAME, SendMailRequestDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ejb.messageservice.cetus.com.co/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ejb.messageservice.cetus.com.co/", name = "reloadParameterResponse")
    public JAXBElement<ReloadParameterResponse> createReloadParameterResponse(ReloadParameterResponse value) {
        return new JAXBElement<ReloadParameterResponse>(_ReloadParameterResponse_QNAME, ReloadParameterResponse.class, null, value);
    }

}
