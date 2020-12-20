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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@ClassName TaoBaoImpl
 *@Description  tb商家代理金士顿u盘的销售
 *@Author zhutao
 *@Date 2020/12/19 15:29
 *@Version 1.0
 **/
@Service
public class TaoBaoImpl implements ProxyStatic {

    //声明具体代理的厂家是金士顿u盘
    @Autowired
    private KingsdFactoryImpl kingsdFactory;

    //声明具体代理的是东芝u盘
    @Autowired
    private ToshibaFactoryImpl toshibaFactory;

    /**
     * tb商城卖u盘的行为
     * @param amount:价格
     * @return
     */
    @Override
    public int sellUsb(int amount) {
        //向厂家发送订单,厂家发货给商家,这里amount没啥用,不用管
        //获得厂家的出厂价
//        int price = kingsdFactory.sellUsb(amount);
        int price = toshibaFactory.sellUsb(amount);
        //商家加价卖给消费者
        price = price + 15;
        System.out.println("===========>淘宝商家加价卖给消费者");
        //消费者最后需要支付的价格
        return price;
    }
}
