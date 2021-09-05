package com.wj.springcloud.service;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/4 22:22
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
