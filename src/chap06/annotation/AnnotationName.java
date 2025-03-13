package chap06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE,ElementType.CONSTRUCTOR})
public @interface AnnotationName {
    String value() default "";
    String elementOne() default "";
    int elementTwo() default 10;
}
