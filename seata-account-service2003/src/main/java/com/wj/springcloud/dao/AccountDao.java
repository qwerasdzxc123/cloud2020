package com.wj.springcloud.dao;

import feign.Param;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/4 23:01
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
