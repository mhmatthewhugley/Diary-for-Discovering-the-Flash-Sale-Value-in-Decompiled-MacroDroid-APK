package p458df;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: df.h */
/* compiled from: HTTP */
public @interface C17129h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
