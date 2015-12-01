package co.com.cetus.messageservice.ejb.mail;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import co.com.cetus.common.util.UtilCommon;
import co.com.cetus.common.validation.EmailValidator;
import co.com.cetus.messageservice.ejb.dto.SendMailRequestDTO;
import co.com.cetus.messageservice.ejb.util.ConstantEJB;

/**
 * The Class SendMail.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version CetusMessageServiceEJB (25/07/2015)
 */
public class SendMail {
  
  /**
   * </p> Instancia un nuevo send mail. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @since CetusMessageServiceEJB (25/07/2015)
   */
  public SendMail () {
  }
  
  /**
   * </p> Send. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param sendMailRequestDTO the send mail request dto
   * @return true, si el proceso fue exitoso
   * @since CetusMessageServiceEJB (25/07/2015)
   */
  public static boolean send ( SendMailRequestDTO sendMailRequestDTO ) {
    boolean result = false;
    try {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "Inicia el envio del correo" );
      
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Validando el correo del remitente: " + sendMailRequestDTO.getSenderEmail() );
      
      if ( EmailValidator.validate( sendMailRequestDTO.getSenderEmail() ) ) {
        
        Properties props = new Properties();
        props.put( "mail.smtp.host", sendMailRequestDTO.getServerSmtp() );
        props.put( "mail.smtp.user", sendMailRequestDTO.getSenderEmail() );
        props.put( "mail.smtp.port", sendMailRequestDTO.getServerPort() );
        props.put( "mail.smtp.starttls.enable", "true" );
        props.put( "mail.smtp.auth", "true" );
        props.put( "mail.smtp.socketFactory.pRort", sendMailRequestDTO.getServerPort() );
        props.put( "mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory" );
        props.put( "mail.smtp.socketFactory.fallback", "false" );
        
        System.setProperty( "mail.mime.charset", "iso-8859-1" );
        
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Procede a autenticar al usuario remitente" );
        SMTPAuthentication auth = new SMTPAuthentication( sendMailRequestDTO.getSenderEmail(), sendMailRequestDTO.getSenderPassword() );
        
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Obtener la Sesion por defecto" );
        Session session = Session.getDefaultInstance( props, auth );
        session.setDebug( true );
        
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Crear el objeto para el mensaje" );
        Message message = new MimeMessage( session );
        
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer el nombre [" + sendMailRequestDTO.getSenderName() + "] y correo del remitente ["
                                                 + sendMailRequestDTO.getSenderEmail() + "]" );
        if ( UtilCommon.stringNullOrEmpty( sendMailRequestDTO.getSenderName() ) ) {
          message.setFrom( new InternetAddress( sendMailRequestDTO.getSenderEmail() ) );
        } else {
          message.setFrom( new InternetAddress( sendMailRequestDTO.getSenderEmail(), sendMailRequestDTO.getSenderName() ) );
        }
        
        if ( sendMailRequestDTO.getRecipients() != null ) {
          String[] recipients = sendMailRequestDTO.getRecipients();
          InternetAddress[] addressTo = new InternetAddress[recipients.length];
          for ( int i = 0; i < recipients.length; i++ ) {
            addressTo[i] = new InternetAddress( recipients[i] );
          }
          ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer los destinatarios directos: " + Arrays.toString( addressTo ) );
          message.setRecipients( Message.RecipientType.TO, addressTo );
        }
        
        if ( sendMailRequestDTO.getCopyToRecipients() != null ) {
          ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer los destinatarios copiados" );
          String[] copyToRecipients = sendMailRequestDTO.getCopyToRecipients();
          InternetAddress[] addressCopyToRecipients = new InternetAddress[copyToRecipients.length];
          for ( int i = 0; i < copyToRecipients.length; i++ ) {
            addressCopyToRecipients[i] = new InternetAddress( copyToRecipients[i] );
          }
          ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer los destinatarios copiados: " + Arrays.toString( copyToRecipients ) );
          message.setRecipients( Message.RecipientType.CC, addressCopyToRecipients );
        }
        
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer asunto ["+ sendMailRequestDTO.getSubject() +"] del mensaje" );
        message.setSubject( sendMailRequestDTO.getSubject() );
        
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer mensaje ["+ sendMailRequestDTO.getMessage() +"]" );
        message.setContent( sendMailRequestDTO.getMessage(), "text/html" );
        
        
        if ( sendMailRequestDTO.getAttached1() != null || sendMailRequestDTO.getAttached2() != null || sendMailRequestDTO.getAttached3() != null ) {
          BodyPart bpContent = new MimeBodyPart();
          Multipart multipart = new MimeMultipart();
          if ( sendMailRequestDTO.getAttached1() != null ) {
            ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer Adjunto 1" );
            File file = File.createTempFile( "fileTemp", "" );
            FileOutputStream fos = new FileOutputStream( file );
            fos.write( sendMailRequestDTO.getAttached1() );
            fos.flush();
            fos.close();
            
            FileDataSource fds = new FileDataSource( file );
            BodyPart bpAttachment = new MimeBodyPart();
            bpAttachment.setDataHandler( new DataHandler( fds ) );
            String fileName = "Adjunto 1";
            if ( sendMailRequestDTO.getNameFileAttached() != null && sendMailRequestDTO.getNameFileAttached().length > 0 ) {
              fileName = sendMailRequestDTO.getNameFileAttached()[0];
            }
            bpAttachment.setFileName( fileName );
            multipart.addBodyPart( bpAttachment );
          }
          
          if ( sendMailRequestDTO.getAttached2() != null ) {
            ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer Adjunto 2" );
            File file = File.createTempFile( "fileTemp", "" );
            FileOutputStream fos = new FileOutputStream( file );
            fos.write( sendMailRequestDTO.getAttached2() );
            fos.flush();
            fos.close();
            
            FileDataSource fds = new FileDataSource( file );
            BodyPart bpAttachment = new MimeBodyPart();
            bpAttachment.setDataHandler( new DataHandler( fds ) );
            String fileName = "Adjunto 2";
            if ( sendMailRequestDTO.getNameFileAttached() != null && sendMailRequestDTO.getNameFileAttached().length > 1 ) {
              fileName = sendMailRequestDTO.getNameFileAttached()[1];
            }
            bpAttachment.setFileName( fileName );
            multipart.addBodyPart( bpAttachment );
          }
          
          if ( sendMailRequestDTO.getAttached3() != null ) {
            ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Establecer Adjunto 2" );
            File file = File.createTempFile( "fileTemp", "" );
            FileOutputStream fos = new FileOutputStream( file );
            fos.write( sendMailRequestDTO.getAttached3() );
            fos.flush();
            fos.close();
            
            FileDataSource fds = new FileDataSource( file );
            BodyPart bpAttachment = new MimeBodyPart();
            bpAttachment.setDataHandler( new DataHandler( fds ) );
            String fileName = "Adjunto 3";
            if ( sendMailRequestDTO.getNameFileAttached() != null && sendMailRequestDTO.getNameFileAttached().length > 2 ) {
              fileName = sendMailRequestDTO.getNameFileAttached()[2];
            }
            bpAttachment.setFileName( fileName );
            multipart.addBodyPart( bpAttachment );
          }
          
          ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Estableciendo miltipart" );
          
          bpContent.setContent( sendMailRequestDTO.getMessage(), "text/html" );
          multipart.addBodyPart( bpContent );
          message.setContent( multipart );
        }
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Enviando Correo..." );
        Transport.send( message );
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Correo enviado" );
        result = true;
      } else {
        ConstantEJB.CETUS_MESSAGE_EJB_LOG.debug( "Correo " + sendMailRequestDTO.getSenderEmail() + " no valido" );
        result = false;
      }
      
    } catch ( Exception e ) {
      ConstantEJB.CETUS_MESSAGE_EJB_LOG.error( e.getMessage(), e );
    }
    ConstantEJB.CETUS_MESSAGE_EJB_LOG.info( "Finaliza el envio del correo con resultado: " + result );
    return result;
  }
}
