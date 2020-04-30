package com.soft1851.springboot.aop.entity;/*@ClassName SysRole
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysRole {
    private  String roleId;
    private  String roleName;
    private String description;
}
