package com.example.springboot.config;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2020/12/18          zhutao                 1.0            Initial Version
 **/

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *@ClassName WebMvcConfig
 *@Description 拦截器配置类
 *@Author zhutao
 *@Date 2020/12/18 11:01
 *@Version 1.0
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new IndexInterceptor())
//                .addPathPatterns("/**")
//                //配置忽略拦截的接口
//                .excludePathPatterns("/login/{*}","/get-error")
        ;
    }
}
