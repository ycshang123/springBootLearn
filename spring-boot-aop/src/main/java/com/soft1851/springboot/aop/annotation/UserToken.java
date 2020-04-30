package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserToken {
    String[] verification_code() default "";
}
