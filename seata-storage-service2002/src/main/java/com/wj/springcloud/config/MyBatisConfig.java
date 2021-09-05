package com.wj.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/4 22:31
 */
@Configuration
@MapperScan({"com.wj.springcloud.dao"})
public class MyBatisConfig {
}
