package com.example.feign.web;

import com.example.feign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {

    @Autowired
    private FeignClientService feignClientService;

    @RequestMapping(value = "/feign_client_test",method = RequestMethod.GET)
    public String test(String content){
        return feignClientService.printContent(content);
    }


}
