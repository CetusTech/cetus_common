package co.com.cetus.common.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface UniqueConstraints.
 *
 * @author Andres Herrera - Cetus Technology
 */
@Target ( ElementType.TYPE )
@Retention ( RetentionPolicy.RUNTIME )
public @interface UniqueConstraints {
  
  /**
   * <p> Unique constraints. </p>
   *
   * @return el unique constraint[]
   * @author Andres Herrera - Cetus Technology
   */
  UniqueConstraint[] uniqueConstraints();
}
