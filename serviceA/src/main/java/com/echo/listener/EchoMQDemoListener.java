package com.echo.listener;

import com.echo.constant.MQConstants;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * className: EchoMQDemoListener <BR>
 * description: MQ监听的demo<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/21 10:43 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@Component
public class EchoMQDemoListener {


    /**
     * methodName: msg <BR>
     * description: 监听MQ消息测试<BR>
     * remark: <BR>
     * param: msg 入参需要和发送的消息体保持一致<BR>
     * return: void <BR>
     * author: ChenQi <BR>
     * createDate: 2020-07-21 10:53 <BR>
     */
    @RabbitListener(queues = MQConstants.QUEUE_ECHO)
    public void msg(String msg){
        System.out.println("消费者消费消息了："+msg);
    }
}
