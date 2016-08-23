package annoation;

import java.lang.annotation.*;

/**
 * Created by dyr on 2016/8/10.
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface doc {
    String name();
    int age() default 10;
}
