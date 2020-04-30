package com.soft1851.springboot.mybatis.plus.mapper;

import com.soft1851.springboot.mybatis.plus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserMapperTest {
@Resource
private UserMapper userMapper;
    @Test
    void selectAll() {
        /**
         * 查询所有信息
         */
        List<User> lists = userMapper.selectList(null);
        lists.forEach(System.out::println);




    }
    @Test
    void insert(){
        /**
         * 新增用户
         */
        User user = User.builder().userId("123456").build();
        int number = userMapper.insert(user);
        System.out.println(number);
    }
    @Test
    void deleteById(){
        User user = User.builder().userId("123456").build();
        int number = userMapper.deleteById(user.getUserId());
        System.out.println(number);
    }

    @Test
    void selectCount(){
        int number = userMapper.selectCount(null);
        System.out.println(number);
    }

}