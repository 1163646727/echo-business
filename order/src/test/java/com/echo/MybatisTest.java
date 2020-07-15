package com.echo;

import com.echo.entity.SysUser;
import com.echo.service.SysService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void loginTest(){
        SysUser sysUser = new SysUser();
        sysUser.setUsername("admin");
        sysUser.setPassword("123");
        sysUser.setNid("2");
        SysUser sys = sysService.selectByNameAndPassword(sysUser);
        System.out.println(sys);
    }

}
