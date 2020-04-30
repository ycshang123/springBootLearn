package com.soft1851.springboot.aop.entity;/*@ClassName User
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/13
 *@Version 1.0
 **/

import lombok.Data;


@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String verificationCode;
}
