package com.soft1851.springboot.aop.mapper;/*@ClassName SysUserMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import com.soft1851.springboot.aop.entity.SysUser;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface SysUserMapper {
    @Select("SELECT t1.*, t2.* " +
            "FROM user_role t3 " +
            "LEFT JOIN sys_user t1 " +
            "ON t1.user_id = t3.user_id " +
            "LEFT JOIN sys_role t2 " +
            "ON t2.role_id = t3.role_id " +
            "WHERE t3.user_id=#{userId}")
    Map<String,Object> getUserById(String userId);

    @Select("SELECT * FROM sys_user WHERE user_id=#{userId}")
    SysUser signIn(String userId);
}
