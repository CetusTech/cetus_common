package co.com.cetus.common.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class EmailValidator.
 *
 * @author Jose David Salcedo M. - Cetus Technology
 * @version commons-util (23/07/2015)
 */
public class EmailValidator {
  
  /** The Constant EMAIL_PATTERN. */
  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
                                              "[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
                                              "(\\.[A-Za-z]{2,})$";
  
  /**
   * </p> Instancia un nuevo email validator. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @since commons-util (23/07/2015)
   */
  public EmailValidator () {
  }
  
  /**
   * </p> Validate. </p>
   *
   * @author Jose David Salcedo M. - Cetus Technology
   * @param email the email
   * @return true, si el proceso fue exitoso
   * @since commons-util (23/07/2015)
   */
  public static boolean validate ( String email ) {
    boolean response = false;
    Pattern pattern = null;
    Matcher matcher = null;
    try {
      pattern = Pattern.compile( EMAIL_PATTERN );
      
      matcher = pattern.matcher( email );
      if ( matcher.matches() ) {
        response = true;
      } else {
        response = false;
      }
    } catch ( Exception e ) {
      response = false;
      e.printStackTrace();
    }
    return response;
  }
}
