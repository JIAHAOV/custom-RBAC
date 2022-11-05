package com.study.permission.annotation;


import java.lang.annotation.*;


/**
 * 自定义权限校验注解
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HasRole {
    /**
     * 拥有权限操作的角色
     */
    String[] value() default {};
}
