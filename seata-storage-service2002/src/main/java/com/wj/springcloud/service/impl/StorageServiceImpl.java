package com.wj.springcloud.service.impl;

import com.wj.springcloud.dao.StorageDao;
import com.wj.springcloud.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: WangJin
 * @description
 * @date: 2021/9/4 22:23
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
