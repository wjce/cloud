package com.example.cilent.com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/test")
    public String test(String content){
        return "test content is:"+ content+"        端口号：" + port;
    }

}
