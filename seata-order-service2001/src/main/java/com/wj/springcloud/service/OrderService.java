package com.wj.springcloud.service;

import com.wj.springcloud.domain.Order;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/3 23:44
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
