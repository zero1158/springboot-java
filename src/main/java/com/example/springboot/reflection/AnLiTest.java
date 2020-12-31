package com.example.springboot.reflection;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2020/12/31          zhutao                 1.0            Initial Version
 **/

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 *@ClassName AnLiTest
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/31 10:31
 *@Version 1.0
 **/
public class AnLiTest {
    public static void main(String[] args) throws Exception {
        //获取配置文件中的内容
        Properties pro = new Properties();

        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        InputStream stream = classLoader.getResourceAsStream("reflection.properties");
        pro.load(stream);

        //获取配置文件中的信息
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //将指定文件加载到内存中
        Class<?> demo = Class.forName(className);
        Method method = demo.getDeclaredMethod(methodName,String.class);
        //创建对象
        Object o = demo.newInstance();
        method.invoke(o,"小明");
    }
}
