package com.soft1851.springboot.aop.controller;/*@ClassName UsersController
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/13
 *@Version 1.0
 **/

import com.soft1851.springboot.aop.annotation.UserToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UsersController {

    @GetMapping("password")
    @UserToken
    public String LoginByPassword(String name){
        log.info("LoginByPassword()方法无需鉴权，需要认证，当前用户名"+name);
        return "LoginByCode方法访问成功";
    }
    @GetMapping("code")
    @UserToken(verification_code = {"123456","456789"})
    public String LoginByCode(String name){
        log.info("LoginByCode()方法需要鉴权，当前用户名"+name);
        return "LoginByCode()方法访问成功";
    }



}
