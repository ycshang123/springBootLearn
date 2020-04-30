package com.soft1851.springboot.aop.service;/*@ClassName SysUserService
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import java.util.Map;

public interface SysUserService {
    Map<String,Object> signIn(String id, String password);
}
