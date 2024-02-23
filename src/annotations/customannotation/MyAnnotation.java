package annotations.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    class should have @interface annotation.
    Annotation will have retention policy which defines when this annotation is actually be applied, values can be, compiling time, build time and runtime.
    Target - to what kind of data this annotation can be applied. Values can be Variables, methods, constructors and so on.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface MyAnnotation {

}
