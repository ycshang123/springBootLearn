package com.soft1851.springboot.aop.mapper;/*@ClassName SysRoleMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE role_id=#{roleId}")
    Map<String, Object> getRoleById(int roleId);
}
