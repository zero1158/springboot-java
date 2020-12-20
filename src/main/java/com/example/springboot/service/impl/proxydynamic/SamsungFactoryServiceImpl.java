package com.example.springboot.service.impl.proxydynamic;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2020/12/20          zhutao                 1.0            Initial Version
 **/

import com.example.springboot.service.ProxyDymanicService;
import org.springframework.stereotype.Service;

/**
 *@ClassName SamsungFactory
 *@Description 三星u盘厂家(动态代理中的目标类)
 *@Author zhutao
 *@Date 2020/12/20 11:13
 *@Version 1.0
 **/
@Service
public class SamsungFactoryServiceImpl implements ProxyDymanicService {

    /**
     * 三星厂家(目标类) ->销售u盘的行为
     * @param amount
     * @return
     */
    @Override
    public int sellUsb(int amount) {
        System.out.println("=========================目标类中方法执行======================");
        int price = amount * 100;
        return price;
    }
}
