package com.wj.springcloud.service.impl;

import com.wj.springcloud.dao.PaymentDao;
import com.wj.springcloud.entities.Payment;
import com.wj.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: WangJin
 * @description service接口实现类
 * @date: 2021/8/29 19:18
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return  paymentDao.create(payment);
    }
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
