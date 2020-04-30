package com.soft1851.springboot.mybatis.plus.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SysPermissionMapperTest {
@Resource
private  SysPermissionMapper sysPermissionMapper;
    @Test
    void selectRoleById() {
        sysPermissionMapper.selectRoleById("2").forEach(System.out::println);
    }
}