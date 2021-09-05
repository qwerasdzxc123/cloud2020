package com.wj.springcloud.dao;

import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/4 22:10
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
