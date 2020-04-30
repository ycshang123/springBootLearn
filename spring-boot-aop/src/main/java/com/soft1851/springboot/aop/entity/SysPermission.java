package com.soft1851.springboot.aop.entity;/*@ClassName SysPermission
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/14
 *@Version 1.0
 **/

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysPermission {
    private String id;
    private String parentId;
    private Integer type;
    private String name;
    private String icon;
    private  String path;
    private  String ex1;
    private String ex2;
}
