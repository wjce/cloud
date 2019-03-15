package com.example.cilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CilentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CilentApplication.class, args);
    }
}
