package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello1")//队列名称
public class HelloReceiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("单对单接收参数  : " + hello);
    }

}
