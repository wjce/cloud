package com.example.customer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，
     * 熔断方法直接返回了一个字符串，字符串为"test,"+testContent+",sorry,error!"，代码如下：
     * @param testContent
     * @return
     */
    @HystrixCommand(fallbackMethod = "testError")
    public String testService(String testContent){
        /**
         * 用程序名替代了具体的url地址，在ribbon中它会根据服务名来选择具体的服务实例，
         * 根据服务实例在请求的时候会用具体的url替换掉服务名
         */
        return restTemplate.getForObject("http://CLIENT/test?content="+testContent,String.class);
    }

    public String testError(String testContent) {
        return "test,"+testContent+",熔断器!";
    }
}
