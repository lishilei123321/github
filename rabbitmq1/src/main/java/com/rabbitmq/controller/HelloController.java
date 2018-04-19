package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.sender.CallBackSender;
import com.rabbitmq.sender.Hsender;

@RestController
public class HelloController {
    
    @Autowired
    private Hsender helloSender;
    
    @Autowired
    private CallBackSender callBackSender;

     // http://localhost:8081/hello
    @GetMapping(value = "/hello")
    public String hello() throws Exception {
        return helloSender.send();
        
    }
    
    @PostMapping("/callback")
    public String callbak() {
        callBackSender.send();
        return "消息处理成功";
    }
}
