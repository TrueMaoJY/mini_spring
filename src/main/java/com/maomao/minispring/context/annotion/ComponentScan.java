package com.maomao.minispring.context.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MaoJY
 * @create 2022-03-19 20:15
 * @Description:包扫描
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ComponentScan {
     /**
     * Description:包扫描路径
     * date: 2022/3/19 20:22
     * @author: MaoJY
     * @since JDK 1.8
     */
     String value() default "";
}