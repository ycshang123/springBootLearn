package com.soft1851.springboot.aop.entity;/*@ClassName SysUser
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
@Data
public class SysUser {
    private String userId;
    private String userName;
    private String password;
    private Timestamp createTime;
    private String avatar;
}
