package com.example.springboot.service.impl.proxystatic;
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

import com.example.springboot.service.ProxyStaticService;
import org.springframework.stereotype.Service;

/**
 *@ClassName ToshibaFactoryImpl
 *@Description 东芝u盘厂家(目标类)
 *@Author zhutao
 *@Date 2020/12/19 16:06
 *@Version 1.0
 **/
@Service
public class ToshibaFactoryImpl implements ProxyStaticService {

    /**
     * 东芝卖u盘的行为
     * @param amount:价格
     * @return
     */
    @Override
    public int sellUsb(int amount) {
        return 100;
    }
}
