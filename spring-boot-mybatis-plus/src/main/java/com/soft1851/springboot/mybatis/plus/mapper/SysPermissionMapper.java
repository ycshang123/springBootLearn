package com.soft1851.springboot.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.springboot.mybatis.plus.entity.SysPermission;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ycshang
 * @since 2020-04-16
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    List<SysPermission> selectRoleById(String id);

}
