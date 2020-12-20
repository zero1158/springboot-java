package com.example.springboot.web;
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

import com.example.springboot.service.impl.proxystatic.TaoBaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName ProxyStaticController
 *@Description 静态代理实现类
 *@Author zhutao
 *@Date 2020/12/19 15:38
 *@Version 1.0
 **/
@RestController
public class ProxyStaticController {

    /**
     * 静态代理这里的代理类是写死的,不变的
     */
    @Autowired
    private TaoBaoImpl taoBao;

    /**
     * 消费者购买行为
     * 这里使用了restful的格式传参
     * @param price
     * @return
     */
    @RequestMapping("proxy/static/{int}")
    public int buyUsb(@PathVariable("int") int price){
        System.out.println("==================客户类购买行为=================");
        int i = taoBao.sellUsb(price);
        System.out.println("===============消费者购买金士顿u盘需要支付的价格================");
        return i;
    }
}
