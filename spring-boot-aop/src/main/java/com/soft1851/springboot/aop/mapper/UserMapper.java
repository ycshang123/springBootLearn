package com.soft1851.springboot.aop.mapper;/*@ClassName UserMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/13
 *@Version 1.0
 **/

import com.soft1851.springboot.aop.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    @Select("SELECT * FROM t_user WHERE verification_code = #{verificationCode}")
    User LoginByCode(String verificationCode);
}
