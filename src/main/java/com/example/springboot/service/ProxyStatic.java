package com.example.springboot.service;
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

/**
 *@ClassName ProxyStatic
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/19 15:20
 *@Version 1.0
 **/
public interface ProxyStatic {

    /**
     * 定义一个卖u盘的方法,该方法由厂家和商家分别实现
     * @param amount:价格
     * @return
     */
    int sellUsb(int amount);

}
