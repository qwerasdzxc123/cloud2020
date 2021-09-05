package com.wj.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wj.springcloud.entities.CommonResult;


/**
 * @author: WangJin
 * @description
 * @date: 2021/9/3 18:08
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
