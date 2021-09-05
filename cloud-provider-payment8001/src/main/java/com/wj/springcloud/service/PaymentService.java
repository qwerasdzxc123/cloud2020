package com.wj.springcloud.service;

import com.wj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author: WangJin
 * @description service服务类型的接口
 * @date: 2021/8/29 19:15
 */
@Service
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
