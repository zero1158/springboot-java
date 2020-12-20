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

import com.example.springboot.service.ReflectionService;
import org.springframework.stereotype.Service;

/**
 *@ClassName ReflectionServiceImpl
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/20 10:52
 *@Version 1.0
 **/
@Service
public class ReflectionServiceImpl implements ReflectionService {

    @Override
    public String getReflection(String name) {
        return "你好: "+name;
    }
}
