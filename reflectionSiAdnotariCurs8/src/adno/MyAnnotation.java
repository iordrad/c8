package adno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})//specific pe ce element de limbaj pot sa pun adnotarea
public @interface MyAnnotation {
    String value();

    int other() default 0;

    double[] array() default {};

    //tipurile permise in adnotare: primitivele, String, Class<?>, array-urile de ele
}
