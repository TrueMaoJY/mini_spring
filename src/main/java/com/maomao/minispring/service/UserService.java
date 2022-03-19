package com.maomao.minispring.service;

import com.maomao.minispring.context.annotion.Autowired;
import com.maomao.minispring.context.annotion.Component;

/**
 * @author MaoJY
 * @create 2022-03-19 20:26
 * @Description:
 */
@Component("userService")
public class UserService {
    @Autowired
   private User user;
}