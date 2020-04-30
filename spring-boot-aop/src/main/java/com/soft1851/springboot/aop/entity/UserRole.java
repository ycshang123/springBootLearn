package com.soft1851.springboot.aop.entity;/*@ClassName UserRole
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRole {
    private String id;
    private String userId;
    private String roleId;
}
