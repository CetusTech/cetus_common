package co.com.cetus.common.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail extends Thread {
  
  private String   SMTP_HOST;
                   
  private String   SMTP_PORT;
                   
  private String   FROM_EMAIL;
                   
  private String   PASS;
                   
  private String   USER_NAME;
  private String   MSG_SUBJECT = null;
  private String   MSG_BODY    = null;
  private String[] TO_EMAIL    = null;
  private String[] CC_EMAIL    = null;
                               
  public SendMail ( String pFrom, String pSmtp, String pPort, String pUserName, String pPass, String pSubject, String pBody,
                    String[] pTo, String pCC[] ) {
    FROM_EMAIL = pFrom;
    SMTP_HOST = pSmtp;
    SMTP_PORT = pPort;
    USER_NAME = pUserName;
    PASS = pPass;
    
    //datos externos
    MSG_SUBJECT = pSubject;
    MSG_BODY = pBody;
    TO_EMAIL = pTo;//
    CC_EMAIL = pCC;
    
  }
  
  public static void main ( String[] args ) {
    String to[] = { "andres.herrera@tecnocom.biz" };
    SendMail sendMail = new SendMail( "andresherra7@gmail.com", "smtp.gmail.com", "465", "andresherra7@gmail.com",
                                      "$agarthi2016", "hola",
                                      "mundo", to, null );
                                      
    sendMail.start();
    
  }
  
  public void send () throws MessagingException {
    try {
      System.out.println( "INICIANDO EL ENVIO DE EMAIL " );
      boolean debug = true;
      SMTPAuthentication auth = new SMTPAuthentication( USER_NAME, PASS );
      // Set the host smtp address
      Properties props = new Properties();
      props.put( "mail.smtp.host", SMTP_HOST );
      props.put( "mail.smtp.auth", "true" );
      props.put( "mail.smtp.port", SMTP_PORT );
      props.put( "mail.smtp.starttls.enable", "true" );
      props.put( "mail.smtp.ssl.trust", "*" );
      props.setProperty( "mail.smtp.auth.mechanisms", "LOGIN NTLM" );
      props.put( "mail.smtp.socketFactory.port", SMTP_PORT );
      props.put( "mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory" );
      props.put( "mail.smtp.socketFactory.fallback", "false" );
      // create some properties and get the default Session
      Session session = Session.getDefaultInstance( props, auth );
      session.setDebug( debug );
      
      // create a message
      Message msg = new MimeMessage( session );
      
      // set the from and to address
      InternetAddress addressFrom = new InternetAddress( FROM_EMAIL );
      msg.setFrom( addressFrom );
      
      InternetAddress[] addressTo = new InternetAddress[TO_EMAIL.length];
      for ( int i = 0; i < TO_EMAIL.length; i++ ) {
        addressTo[i] = new InternetAddress( TO_EMAIL[i] );
      }
      msg.setRecipients( Message.RecipientType.TO, addressTo );
      if ( CC_EMAIL != null ) {
        InternetAddress[] addressCc = new InternetAddress[CC_EMAIL.length];
        int i = 0, j = 0;
        while ( i < CC_EMAIL.length ) {
          if ( CC_EMAIL[i] != null ) {
            addressCc[j] = new InternetAddress( CC_EMAIL[i] );
            j++;
          }
          i++;
        }
        msg.setRecipients( Message.RecipientType.CC, addressCc );
      }
      System.out.println( "Enviando ..." );
      msg.setSubject( MSG_SUBJECT );
      msg.setContent( MSG_BODY, "text/html" );
      Transport transport = session.getTransport( "smtps" );
      transport.connect( SMTP_HOST, Integer.valueOf( SMTP_PORT ), USER_NAME, PASS );
      transport.sendMessage( msg, msg.getAllRecipients() );
      System.out.println( "Mensaje enviado!" );
    } catch ( Exception e ) {
      e.printStackTrace();
      
    }
  }
  
  @Override
  public void run () {
    super.run();
    try {
      send();
    } catch ( MessagingException e ) {
      e.printStackTrace();
    }
  }
  
  public static String[] setRecipients ( String to ) {
    String[] recipients = null;
    if ( to != null ) {
      recipients = to.split( ";" );
    }
    return recipients;
  }
  
  public String getSMTP () {
    return SMTP_HOST;
  }
  
  public void setSMTP ( String sMTP ) {
    SMTP_HOST = sMTP;
  }
  
  public String getSMTP_PORT () {
    return SMTP_PORT;
  }
  
  public void setSMTP_PORT ( String sMTPPORT ) {
    SMTP_PORT = sMTPPORT;
  }
  
}
