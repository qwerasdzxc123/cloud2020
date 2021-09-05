package com.wj.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: WangJin
 * @description config配置类
 * @date: 2021/8/29 23:35
 */
@Configuration
public class ApplicationContextConfig {
    @Bean  //相当于注解方式注入  //applicationContext.xml  <bean id="" class="">
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

