package com.echo.mapper;


import com.echo.entity.SysUser;

import java.util.List;

/**
 * @ClassName:      SysUserMapper
 * @Description:    系统用户
 * @Author:         ChenQi
 * @CreateDate:     2019/4/25 20:41
 */
public interface SysUserMapper {
   int deleteByPrimaryKey(Long id);

   int insert(SysUser record);

   int insertSelective(SysUser record);

   SysUser selectByPrimaryKey(Long id);

   int updateByPrimaryKeySelective(SysUser record);

   int updateByPrimaryKey(SysUser record);

   /**ChenQi 2019/4/28;  根据用户名和密码查询*/
    SysUser selectByNameAndPassword(SysUser sysUser);

    /** 查询全部用户 ChenQi*/
    List<SysUser> selectAll();
}