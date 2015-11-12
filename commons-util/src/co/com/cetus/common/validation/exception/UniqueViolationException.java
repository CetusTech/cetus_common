package co.com.cetus.common.validation.exception;

/**
 * The Class UniqueViolationException.
 *
 * @author Andres Herrera - Cetus Technology
 */
public class UniqueViolationException extends Exception {
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 7949301582308841306L;
  
  /** The name. */
  private String            name;
  
  /** The message. */
  private String            message;
  
  /** The fields. */
  private String[]          fields;
  
  /**
   * <p> Instancia un nuevo unique violation exception. </p>
   *
   * @param pName the p name
   * @param pMessage the p message
   * @param pFields the p fields
   * @author Andres Herrera - Cetus Technology
   */
  public UniqueViolationException ( String pName, String pMessage, String[] pFields )
  {
    super( pName );
    this.name = pName;
    this.message = pMessage;
    this.fields = pFields;
  }
  
  /**
   * <p> Instancia un nuevo unique violation exception. </p>
   *
   * @param pName the p name
   * @param pMessage the p message
   * @author Andres Herrera - Cetus Technology
   */
  public UniqueViolationException ( String pName, String pMessage )
  {
    super( pName );
    this.name = pName;
    this.message = pMessage;
  }
  
  /**
   * <p> Obtiene el name. </p>
   *
   * @return the name
   * @author Andres Herrera - Cetus Technology
   */
  public String getName () {
    return name;
  }
  
  /**
   * <p> Asigna el name. </p>
   *
   * @param name the new name
   * @author Andres Herrera - Cetus Technology
   */
  public void setName ( String name ) {
    this.name = name;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Throwable#getMessage()
   */
  public String getMessage () {
    return message;
  }
  
  /**
   * <p> Asigna el message. </p>
   *
   * @param message the new message
   * @author Andres Herrera - Cetus Technology
   */
  public void setMessage ( String message ) {
    this.message = message;
  }
  
  /**
   * <p> Obtiene el fields. </p>
   *
   * @return the fields
   * @author Andres Herrera - Cetus Technology
   */
  public String[] getFields () {
    return fields;
  }
  
  /**
   * <p> Asigna el fields. </p>
   *
   * @param fields the new fields
   * @author Andres Herrera - Cetus Technology
   */
  public void setFields ( String[] fields ) {
    this.fields = fields;
  }
  
}
