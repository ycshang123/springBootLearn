package com.soft1851.springboot.aop.service;/*@ClassName RolePermissionService
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import java.util.List;
import java.util.Map;

public interface RolePermissionService {

    /**
     * 查询超管权限
     * @return
     */
    List<Map<String, Object>> getAdminRolePermission();

    /**
     * 查询系统管理员权限
     * @return
     */
    List<Map<String, Object>> getRolePermissionBySysAdmin(int sysAdminId);
}
