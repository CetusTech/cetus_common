package co.com.cetus.common.exception;

/**
 * The Class ProcessException.
 * 
 * @author Jose David Salcedo Mandon - Cetus Technology
 */
@SuppressWarnings ( "serial" )
public class ProcessException extends Exception {
  
  /** The delegate. */
  private String delegate;
  
  /** The process. */
  private String process;
  
  private String rutaError;
  
  private String codeError;
  
  /**
   * <p> Instancia un nuevo process exception. </p>
   * 
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public ProcessException () {
  }
  
  /**
   * <p> Instancia un nuevo process exception. </p>
   * 
   * @param message the message
   * @param stackTrace the stack trace
   * @param process the process
   * @param delegate the delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public ProcessException ( String message, String process, String delegate ) {
    super( message );
    this.process = process;
    this.delegate = delegate;
    
    this.setRutaError( "Process: " + this.process + " ==> " );
    if ( this.delegate != null ) this.setRutaError( this.getRutaError() + " Delegate: " + this.delegate + " ==> " );
    
  }
  
  public ProcessException ( String message, String process, String delegate, String code ) {
    super( message );
    this.process = process;
    this.delegate = delegate;
    this.codeError = code;
    
    this.setRutaError( "Process: " + this.process + " ==> " );
    if ( this.delegate != null ) this.setRutaError( this.getRutaError() + " Delegate: " + this.delegate + " ==> " );
    
  }
  
  /**
   * <p> Obtiene el delegate. </p>
   * 
   * @return the delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public String getDelegate () {
    return delegate;
  }
  
  /**
   * <p> Asigna el delegate. </p>
   * 
   * @param delegate the new delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public void setDelegate ( String delegate ) {
    this.delegate = delegate;
  }
  
  /**
   * <p> Obtiene el process. </p>
   * 
   * @return the process
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public String getProcess () {
    return process;
  }
  
  /**
   * <p> Asigna el process. </p>
   * 
   * @param process the new process
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public void setProcess ( String process ) {
    this.process = process;
  }
  
  public String getRutaError () {
    return rutaError;
  }
  
  public void setRutaError ( String rutaError ) {
    this.rutaError = rutaError;
  }
  
  public String getCodeError () {
    return codeError;
  }
  
  public void setCodeError ( String codeError ) {
    this.codeError = codeError;
  }
  
}
