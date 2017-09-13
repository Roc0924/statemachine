package com.example.demo.annotations;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/8/30
 * Time                 : 16:29
 * Description          :
 */
@Inherited
@Component
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StateAnnotation {
    String value() default "";
}
