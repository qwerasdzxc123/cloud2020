package com.wj.springcloud.service;

import com.wj.springcloud.entities.CommonResult;
import com.wj.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/3 21:08
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
