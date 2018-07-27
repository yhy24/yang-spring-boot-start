package com.yang.service;

/**
 * @Author: yhy
 * @Date: 2018/7/26 11:10
 * @Version 1.0
 */
public class HelloService {

    HelloProperties helloProperties;

    public String sayHello(String name) {

        return helloProperties.getPrefix() +"-" +name+"-"+helloProperties.getSuffix();
    }
    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
