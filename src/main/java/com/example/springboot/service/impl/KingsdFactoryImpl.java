package com.example.springboot.service.impl;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2020/12/19          zhutao                 1.0            Initial Version
 **/

import com.example.springboot.service.ProxyStatic;
import org.springframework.stereotype.Service;

/**
 *@ClassName KingsdFactoryImpl
 *@Description 金士顿厂家作为目标类销售u盘
 *@Author zhutao
 *@Date 2020/12/19 15:26
 *@Version 1.0
 **/
@Service
public class KingsdFactoryImpl implements ProxyStatic {

    /**
     * 金士顿u盘厂家
     * @param amount
     * @return
     */
    @Override
    public int sellUsb(int amount) {
        System.out.println("========>厂家卖u盘给淘宝商家");
        //出厂价格
        int price = 85;
        return price;
    }
}
