package com.example.springboot.service.impl.reflection;
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *@ClassName TestReflection
 *@Description 测试反射机制
 *@Author zhutao
 *@Date 2020/12/20 10:54
 *@Version 1.0
 **/
public class TestReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //常规调用
//        ReflectionServiceImpl service = new ReflectionServiceImpl();
//        String s = service.getReflection("李华");
//        System.out.println(s);

        /**
         * 利用反射调用方法
         * 主要是使用Method类中的invoke()方法代替原类中的方法调用
         */
        //1.获取目标类
        ReflectionServiceImpl target = new ReflectionServiceImpl();
        //2.通过反射获取目标类中的指定方法-->获取getReflection方法名对应的Method对象
        Method method = ReflectionServiceImpl.class.getMethod("getReflection", String.class);
        //3.通过Method中的invoke()方法调用目标类中的方法
        /**
         * invoke是Method类中的一个方法,表示执行方法的调用
         * 参数:1.Object  表示目标对象 ,我们现在要执行目标类中的方法
         *      2.Object... args  方法执行需要的参数
         */
        Object invoke = method.invoke(target, "晓红");

        System.out.println(invoke);

    }
}
