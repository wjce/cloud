package com.example.feign.service.impl;

import com.example.feign.service.FeignClientService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FeignClientServiceImpl implements FeignClientService {
    @Override
    public String printContent(String content) {
        return "feign断路由" + content;
    }
}
