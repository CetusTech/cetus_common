package co.com.cetus.common.exception;

/**
 * The Class DelegateException.
 * 
 * @author Jose David Salcedo Mandon - Cetus Technology
 */
@SuppressWarnings ( "serial" )
public class DelegateException extends Exception {
  
  /** The delegate. */
  private String delegate;
  
  /**
   * <p> Instancia un nuevo delegate exception. </p>
   * 
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public DelegateException () {
  }
  
  public DelegateException ( String message ) {
    super( message );
  }
  
  /**
   * <p> Instancia un nuevo delegate exception. </p>
   * 
   * @param message the message
   * @param stackTrace the stack trace
   * @param delegate the delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   */
  public DelegateException ( String message, StackTraceElement[] stackTrace, String delegate ) {
    super( message );
    super.setStackTrace( stackTrace );
    this.delegate = delegate;
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
   * </p> Instancia un nuevo delegate exception. </p>
   *
   * @param message the message
   * @param delegate the delegate
   * @author Jose David Salcedo Mandon - Cetus Technology
   * @since common-util (5/10/2012)
   */
  public DelegateException ( String message, String delegate ) {
    super( message );
    this.delegate = delegate;
  }
  
}
