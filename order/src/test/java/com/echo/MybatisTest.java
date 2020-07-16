package com.echo;

import com.echo.entity.ResultEntity;
import com.echo.entity.SysUser;
import com.echo.mapper.SysUserMapper;
import com.echo.service.SysService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * className: MybatisTest <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/15 19:58 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private SysService sysService;

    @Autowired
    private SysUserMapper sysUserMapper;


    @Test
    public void loginTest(){
        SysUser sysUser = new SysUser();
        sysUser.setUsername("admin");
        sysUser.setPassword("123");
        sysUser.setNid("2");
        SysUser sys = sysService.selectByNameAndPassword(sysUser);
        System.out.println(sys);
    }

    /**
     * methodName: selectAllPage <BR>
     * description: mybatis分页查询测试<BR>
     * remark: <BR>
     * param:  <BR>
     * return: void <BR>
     * author: ChenQi <BR>
     * createDate: 2020-07-16 14:55 <BR>
     */
    @Test
    public void selectAllPage(){
        ResultEntity entity = new ResultEntity();
        int pageSize = 3;
        int pageNum = 1;
        PageHelper.startPage(pageNum,pageSize);
        List<SysUser> list = sysUserMapper.selectAll();
        PageInfo<SysUser> pageInfo=new PageInfo<>( list );
        System.out.println(pageInfo);
    }

}
