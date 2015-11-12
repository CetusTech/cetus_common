package co.com.cetus.common.exception;

/**
 * The Class ServiceException.
 * 
 * @author Jose David Salcedo Mandon - Cetus Technology
 */
@SuppressWarnings ( "serial" )
public class ServiceException extends Exception {
  
  /** The delegate. */
  private String delegate;
  
  /** The process. */
  private String process;
  
  /** The service. */
  private String service;
  
  private String rutaError;
  
  /**
   * <p>
   * Instancia un nuevo service exception.
   * </p>
   * 
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public ServiceException () {
  }
  
  /**
   * <p>
   * Instancia un nuevo service exception.
   * </p>
   * 
   * @param message
   *            the message
   * @param stackTrace
   *            the stack trace
   * @param service
   *            the service
   * @param process
   *            the process
   * @param delegate
   *            the delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public ServiceException ( String message, String service, String process,
                            String delegate ) {
    super( message );
    this.service = service;
    this.process = process;
    this.delegate = delegate;
    
    this.setRutaError( "Service: " + this.service + " ==> " );
    if ( this.process != null ) this.setRutaError( this.getRutaError() + " Process: " + this.process
                                                   + " ==> " );
    if ( this.delegate != null ) this.setRutaError( this.getRutaError() + " Delegate: "
                                                    + this.delegate + " ==> " );
    
    // this.pritnErrorMsg();
  }
  
  /**
   * <p>
   * Pritn error msg.
   * </p>
   * 
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  /*
   * private void pritnErrorMsg() { StringBuffer sb = new StringBuffer();
   * sb.append( "Service: " + this.service ); if ( this.process != null )
   * sb.append( ". Process: " + this.process );
   * 
   * if ( this.delegate != null ) sb.append( ". Delegate: " + this.delegate );
   * 
   * super.getMessage() ); for ( int i = 0; i < this.getStackTrace().length;
   * this.getStackTrace()[i] ); }
   * 
   * }
   */
  
  /**
   * <p>
   * Obtiene el delegate.
   * </p>
   * 
   * @return the delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public String getDelegate () {
    return delegate;
  }
  
  /**
   * <p>
   * Asigna el delegate.
   * </p>
   * 
   * @param delegate
   *            the new delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public void setDelegate ( String delegate ) {
    this.delegate = delegate;
  }
  
  /**
   * <p>
   * Obtiene el process.
   * </p>
   * 
   * @return the process
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public String getProcess () {
    return process;
  }
  
  /**
   * <p>
   * Asigna el process.
   * </p>
   * 
   * @param process
   *            the new process
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public void setProcess ( String process ) {
    this.process = process;
  }
  
  /**
   * <p>
   * Obtiene el service.
   * </p>
   * 
   * @return the service
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public String getService () {
    return service;
  }
  
  /**
   * <p>
   * Asigna el service.
   * </p>
   * 
   * @param service
   *            the new service
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public void setService ( String service ) {
    this.service = service;
  }
  
  public String getRutaError () {
    return rutaError;
  }
  
  public void setRutaError ( String rutaError ) {
    this.rutaError = rutaError;
  }
  
}
