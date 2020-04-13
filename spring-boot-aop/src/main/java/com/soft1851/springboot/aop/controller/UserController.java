package com.soft1851.springboot.aop.controller;/*@ClassName UserController
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/13
 *@Version 1.0
 **/

import com.soft1851.springboot.aop.annotation.AuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    /**
     * 无需有校验，即可访问
     * @param name
     * @return
     */
    @GetMapping("hello")
    public String hello(String name){
        log.info("hello()方法无需鉴权，也无需认证,当前用户名:" +name);
        return "hello方法访问成功";
    }

    /**
     * 需要登录校验，此时方法需要加注解，但不用传角色
     * @param name
     * @return
     */
    @GetMapping("user")
    @AuthToken
    public String user(String name){
        log.info("user()方法无需鉴权，需要认证,当前用户名:" +name);
        return "user方法访问成功";
    }

    /**
     * 需要鉴权，此时的方法需要加注解，需要传角色
     * 角色可以传多个
     * 如果需要更复杂的逻辑操作，建议使用Spring Security,Apache Shiro等安全框架
     * @param name
     * @return
     */
    @GetMapping("admin")
    @AuthToken(role_name = {"admin","Admin"})
    public String admin(String name){
        log.info("admin()方法需要鉴权,当前用户名:" +name);
        return "admin()方法访问成功";
    }
}
