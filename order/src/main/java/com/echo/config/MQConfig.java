package com.echo.config;

import com.echo.constant.MQConstants;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * className: MQConfig <BR>
 * description: MQ配置类<BR>
 * remark: 主要是RabbitMQ的交换机声明、队列声明、交换机和队列绑定<BR>
 * auther: ChenQi <BR>
 * date: 2020/7/21 10:11 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@Configurable
public class MQConfig {

    /** 声明交换机 ChenQi*/
    @Bean
    public Exchange echoExchange(){
        /** directExchange 表示路由交换机 ChenQi*/
        return ExchangeBuilder.directExchange(MQConstants.EXCHANGE_ECHO).durable(true).build();
    }

    /** 声明队列 ChenQi*/
    @Bean
    public Queue echoQueue() {
        Queue queue = new Queue(MQConstants.QUEUE_ECHO);
        return queue;
    }

    /** 绑定队列和交换机 ChenQi*/
    @Bean
    public Binding bindNursePlan() {
        Binding binding = BindingBuilder.bind(echoQueue()).to(echoExchange())
                .with(MQConstants.ROUTE_KEY_ECHO).noargs();
        return binding;
    }
}
