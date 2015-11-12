package co.com.cetus.common.exception;

/**
 * The Class ValidatorException.
 *
 * @author Jose David Salcedo Mandon - Cetus Technology
 * @version common-util (18/04/2012)
 */
@SuppressWarnings ( "serial" )
public class ValidatorException extends Exception {
  
  private String validator;
  
    public ValidatorException () {
  }
  
  public ValidatorException ( String message, String validator ) {
    super( message );
    this.validator = validator;
  }

  public String getValidator () {
    return validator;
  }

  public void setValidator ( String validator ) {
    this.validator = validator;
  }
  
}
