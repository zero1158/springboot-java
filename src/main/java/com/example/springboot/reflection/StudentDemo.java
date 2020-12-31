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
 *@ClassName Demo
 *@Description TODO
 *@Author zhutao
 *@Date 2020/12/31 10:00
 *@Version 1.0
 **/
@Data
public class StudentDemo {
    private String name;
    private Integer age;

    public void doeat(){
        System.out.println("恰发.......");
    }

    public void doeatTwo(String name){
        System.out.println(name + " : 恰发......");
    }

    private void dorun(String name,Integer age){
        System.out.println(name +" ==>"+age+" :跑步.......");
    }
}
