package com.echo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * className: OrderServerApp <BR>
 * description: order资源服务启动类<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/5 9:45 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@MapperScan(basePackages = {"com.echo.mapper","com.echo.dao"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2Doc
public class OrderServerApp {
    public static void main(String[] args) {
        SpringApplication.run (OrderServerApp.class,args);
    }
}
