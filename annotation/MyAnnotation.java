package cn.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
    String hello() default "howard";
    String world();
}
