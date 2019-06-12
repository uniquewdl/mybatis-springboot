package com.example.springbootmybatis;

import java.lang.annotation.*;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 14:59 2019/6/4
 */
@Documented
@Target(ElementType.PARAMETER)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Hump {
}
