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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *@ClassName SamSungInvocation
 *@Description 三星厂家的动态代理类-->相当于静态代理中的taobao商家
 *@Author zhutao
 *@Date 2020/12/20 11:18
 *@Version 1.0
 **/
public class SamSungInvocation implements InvocationHandler {

    private Object target = null;

    /**
     * 因为是动态代理,传入的是什么对象,这里获取的就是什么对象
     * @param target
     */
    public SamSungInvocation(Object target) {
        //这里获取的就是目标类对象
        this.target = target;
    }

    /**
     * 动态代理-->表示代理对象要执行的方法,代理类的功能就写在这里
     *        代理类的功能:1.调用目标方法,执行目标方法中的功能
     *                    2.功能增强,在目标方法调用时,增加其他功能
     * @param proxy:jdk创建的代理对象
     * @param method:目标类在中的方法,jdk提供的Method对象
     * @param args:执行方法需要的参数
     * @return
     * @throws Throwable
     *
     *
     * 可以直接把这个类理解成代理类中的方法,类似于taobao类中的sellUsb()
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //1.执行目标类中的方法
        Object price = method.invoke(target, args);
        System.out.println("------->已执行完目标类中的方法");

        //2.对目标类中的方法进行功能增强
        //相当于商家从厂家拿货后进行的涨价行为
        System.out.println("------------->对目标类中的方法进行功能增强");

        int i = (int) price + 20;
        System.out.println("----------->继续增强");

        return i;
    }
}
