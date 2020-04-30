package com.soft1851.springboot.mybatis.plus.entity;/*@ClassName User
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/16
 *@Version 1.0
 **/

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
@TableName("t_user")
public class User {
    private String userId;
    private String emailFlag;
    private String phoneNumber;
    private String phoneNumberFlag;
    private String fullName;
    private String studentNo;
    private String avatarUrl;
    private Date joinTime;
    private String clazzCourseId;
    private Integer score;

}
