package com.echo.service;

import com.echo.entity.SysUser;
import com.echo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: SysService
 * @Description: PC端->系统业务层
 * @auther: Chenqi
 * @Date: 2019/4/28 15:32
 * @Version 1.0 jdk1.8
 */
@Service
public class SysService {

    @Autowired
    private SysUserMapper sysUserMapper;


    /**
     *@MethodName:  selectByNameAndPassword
     *@Description:  根据用户名和密码查询
     *@Param: [sysUser]
     *@Return: com.pri.entity.SysUser
     *@author: ChenQi
     *@CreateDate: 2019/4/28 15:46
     */
    public SysUser selectByNameAndPassword(SysUser sysUser){
        return sysUserMapper.selectByNameAndPassword(sysUser);
    }
}
