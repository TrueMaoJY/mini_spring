package com.maomao.minisping.test;

import com.maomao.minispring.context.MaoApplicationContext;
import com.maomao.minispring.context.config.AppConfig;

/**
 * @author MaoJY
 * @create 2022-03-19 20:14
 * @Description:
 */
public class MaoApplicationContextTest {
    public static void main(String[] args) {
        MaoApplicationContext maoApplicationContext = new MaoApplicationContext(AppConfig.class);
     Object  bean=  maoApplicationContext.getBean("userService");
    }
}