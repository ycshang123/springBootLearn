package com.soft1851.springboot.aop.mapper;/*@ClassName RolePermissionMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RolePermissionMapper {
    @Results({
            @Result(property = "permission", column = "permission_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getChildPermissionById")),
    })
    @Select("SELECT * FROM role_permission WHERE role_id=#{id}")
    List<Map<String, Object>> getRoleById(int id);
}
