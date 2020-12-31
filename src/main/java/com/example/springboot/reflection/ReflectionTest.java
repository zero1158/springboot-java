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

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *@ClassName Reflection
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/31 9:59
 *@Version 1.0
 **/
public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        //获取class对象
        Class<?> studentDemo = Class.forName("com.example.springboot.reflection.StudentDemo");
        //反射获取所有方法
        Method[] methods = studentDemo.getMethods();
        //反射获取所有成员变量
        Field[] fields = studentDemo.getFields();
        //反射获取对象
        Object demo = studentDemo.newInstance();

        Method doeatTwo = studentDemo.getMethod("doeatTwo", String.class);
        Method doeat = studentDemo.getMethod("doeat", null);
        doeatTwo.invoke(demo,"小明");
        doeat.invoke(demo,null);

        Method dorun = studentDemo.getDeclaredMethod("dorun", String.class, Integer.class);
        //暴力反射-->解决private方法
        dorun.setAccessible(true);
        dorun.invoke(demo,"小华",19);
    }
}
