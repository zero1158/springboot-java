package com.example.springboot.web;
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
import com.example.springboot.service.impl.proxydynamic.SamSungInvocation;
import com.example.springboot.service.impl.proxydynamic.SamsungFactoryServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;

/**
 *@ClassName ProxyDynamicController
 *@Description 动态代理测试实现类
 *@Author zhutao
 *@Date 2020/12/20 11:48
 *@Version 1.0
 **/
@RestController
public class ProxyDynamicController {

    @RequestMapping("proxy/dynamic/{int}")
    private String sellUsb(@PathVariable("int") int amount){

        //创建动态代理类
        //1获取创建动态代理类需要的参数--->创建目标对象
        ProxyDymanicService target = new SamsungFactoryServiceImpl();
        //2获取创建动态代理类需要的参数--->创建代理方法对象
        SamSungInvocation handler = new SamSungInvocation(target);
        //3.正式创建动态代理对象-->获取代理类对象并转成接口类型
        ProxyDymanicService proxy = (ProxyDymanicService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        System.out.println("获取代理类对象 ---> proxy");

        //4.通过代理类执行目标类中的方法
        int i = proxy.sellUsb(amount);

        return String.valueOf(i);
    }

}
