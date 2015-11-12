package co.com.cetus.common.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface UniqueConstraint.
 *
 * @author Andres Herrera - Cetus Technology
 */
@Target ( ElementType.TYPE )
@Retention ( RetentionPolicy.RUNTIME )
public @interface UniqueConstraint {
  
  /**
   * <p> Name. </p>
   *
   * @return el string
   * @author Andres Herrera - Cetus Technology
   */
  String name();
  
  /**
   * <p> Fields. </p>
   *
   * @return el string[]
   * @author Andres Herrera - Cetus Technology
   */
  String[] fields();
  
  /**
   * <p> Error message. </p>
   *
   * @return el string
   * @author Andres Herrera - Cetus Technology
   */
  String errorMessage();
}
