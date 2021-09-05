package com.wj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: WangJin
 * @description
 * @date: 2021/8/30 0:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {  //实现系列化
    private Long id;
    private String serial;
}
