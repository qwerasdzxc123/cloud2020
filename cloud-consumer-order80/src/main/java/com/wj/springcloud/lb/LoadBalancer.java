package com.wj.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: WangJin
 * @description  收集所有eureka活着的机器工作
 * @date: 2021/8/31 11:48
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
