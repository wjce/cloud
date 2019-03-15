package com.example.feign.service;

import com.example.feign.service.impl.FeignClientServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "Client", fallback = FeignClientServiceImpl.class)
public interface FeignClientService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String printContent(@RequestParam(value = "content") String content);

}
