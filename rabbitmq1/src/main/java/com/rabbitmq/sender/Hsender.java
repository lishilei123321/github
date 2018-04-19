package com.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hsender {

    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public String  send() {
        String context = "hello " + "你好我是单对单测试";
        System.out.println("---单对单发送参数 : " + context);
        amqpTemplate.convertAndSend("directExchange","hello2", context);//路由键
        return "发送成功";
     }

}
