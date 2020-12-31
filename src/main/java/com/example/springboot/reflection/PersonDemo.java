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

import lombok.Data;

/**
 *@ClassName PersonDemo
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/31 10:53
 *@Version 1.0
 **/
@Data
public class PersonDemo {
    private String name;
    private String sex;

    public void works(String name){
        System.out.println(name + "===>打工人打工....");
    }
}
