package com.yang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yhy
 * @Date: 2018/7/26 11:13
 * @Version 1.0
 */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguer {

    @Autowired
    HelloProperties helloProperties;
    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(helloProperties);

        return helloService;
    }
}
