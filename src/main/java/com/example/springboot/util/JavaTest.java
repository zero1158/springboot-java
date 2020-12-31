package com.example.springboot.util;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2020/12/24          zhutao                 1.0            Initial Version
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName JavaTest
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/24 14:00
 *@Version 1.0
 **/
public class JavaTest {

    @Autowired
    ApplicationContext applicationContext;

    private void parseCacheDuration(ApplicationContext applicationContext) {
        final Map<String, Long> cacheExpires = new HashMap<>();
        String[] beanNames = applicationContext.getBeanNamesForType(Object.class);
        for (String beanName : beanNames) {
            System.out.println("===>"+beanName);
        }
    }

}
