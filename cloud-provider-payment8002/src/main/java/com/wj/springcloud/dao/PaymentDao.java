package com.wj.springcloud.dao;

import com.wj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: WangJin
 * @description dao接口Payment，创建接口型参数调用接口
 * @date: 2021/8/29 18:14
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
