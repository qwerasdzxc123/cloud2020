package com.wj.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/1 12:29
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_ok,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_ok,o(╥﹏╥)o";
    }
}
