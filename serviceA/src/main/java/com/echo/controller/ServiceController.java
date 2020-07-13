package com.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: ServiceController <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/11 9:08 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@RestController
public class ServiceController {

    @GetMapping("/r1")
    public String r1(){
        return "serviceA的r1资源";
    }

    /**
     * methodName: remote <BR>
     * description: 测试微服务调用<BR>
     * remark: <BR>
     * param:  <BR>
     * return: java.lang.String <BR>
     * author: ChenQi <BR>
     * createDate: 2020-07-13 16:11 <BR>
     */
    @GetMapping(value = "/remote")
    public String remote(){
        return "serviceA的remote资源。";
    }

}
