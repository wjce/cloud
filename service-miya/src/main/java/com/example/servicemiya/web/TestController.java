package com.example.servicemiya.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "test success!!!";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String info(){
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }
}
