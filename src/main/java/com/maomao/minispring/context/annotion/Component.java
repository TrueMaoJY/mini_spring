package com.maomao.minispring.context.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MaoJY
 * @create 2022-03-19 20:15
 * @Description:bean管理
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Component {
     /**
     * Description:可以给类起别名
     * date: 2022/3/19 20:21
     * @author: MaoJY
     * @since JDK 1.8
     */
     String value() default "";
}