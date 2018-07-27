package com.yang.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: yhy
 * @Date: 2018/7/26 11:12
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "yang.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
