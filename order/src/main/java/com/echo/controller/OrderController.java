package com.echo.controller;

import com.echo.constant.MQConstants;
import com.echo.dto.UserDTO;
import com.echo.remote.ServiceARemote;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.apache.commons.lang.StringUtils;

/**
 * className: OrderController <BR>
 * description: order资源<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-05 14:38 <BR>
 */
@RestController
public class OrderController {

    @Autowired
    private ServiceARemote serviceARemote;

    /** 注入RabbitMQ的模板 ChenQi*/
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @GetMapping(value = "/r1")
    @PreAuthorize("hasAuthority('p1')")//拥有p1权限方可访问此url
    public String r1(){
        //获取用户身份信息
        UserDTO  userDTO = new UserDTO();
        try {
            userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            System.out.println(e);
        }
        //return (StringUtils.isBlank(userDTO.getFullname()) ? "匿名" : userDTO.getFullname())+"访问资源1";
        return (userDTO.getFullname() == null ? "匿名" : userDTO.getFullname())+"访问资源1";
    }

    @GetMapping(value = "/r2")
    @PreAuthorize("hasAuthority('p3')")//拥有p1权限方可访问此url
    public String r2(){
        //获取用户身份信息
        UserDTO  userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        // return (StringUtils.isBlank(userDTO.getFullname()) ? "匿名" : userDTO.getFullname())+"访问资源2";
        return (userDTO.getFullname() == null ? "匿名" : userDTO.getFullname())+"访问资源2";
    }

    @GetMapping(value = "/r3")
    //@PreAuthorize("hasAuthority('p1')")//拥有p1权限方可访问此url
    public String r3(){
        //获取用户身份信息
        UserDTO  userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        // return (StringUtils.isBlank(userDTO.getFullname()) ? "匿名" : userDTO.getFullname())+"访问资源3";
        return (userDTO.getFullname() == null ? "匿名" : userDTO.getFullname())+"访问资源3";
    }

    @GetMapping(value = "/remoteServiceA")
    public String remoteServiceA(){
        return serviceARemote.remote();
    }

    /**
     * methodName: sendMsg <BR>
     * description: 发送MQ消息<BR>
     * remark: <BR>
     * param: msg <BR>
     * return: java.lang.String <BR>
     * author: ChenQi <BR>
     * createDate: 2020-07-21 10:37 <BR>
     */
    @GetMapping(value = "/sendMsg")
    public String sendMsg(@RequestParam String msg){
        rabbitTemplate.convertAndSend(MQConstants.EXCHANGE_ECHO,MQConstants.ROUTE_KEY_ECHO,msg);
        return "发送消息成功!";
    }

}