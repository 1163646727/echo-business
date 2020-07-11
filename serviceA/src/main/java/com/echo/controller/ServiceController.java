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
}
