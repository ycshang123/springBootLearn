package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
@SpringBootTest
class UserMapperTest {
@Resource
private  UserMapper userMapper;
    @Test
    void loginByPassword() {
        User user = new User();
        user.setPassword("123456");
        String password = user.getPassword();
//        userMapper.LoginByPassword(password);
    }

    @Test
    void loginByCode() {
        User user = new User();
        user.setVerificationCode("123456");
        String code = user.getVerificationCode();
        userMapper.LoginByCode(code);
        System.out.println(userMapper.LoginByCode(code));
    }
}