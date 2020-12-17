package com.example.springboot.web;

import com.example.springboot.config.IndexDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${test.dev}")
    private String dev;

    @Autowired
    private IndexDemo test;

    /**
     * 测试@Value和@ConfigurationProperties注解
     * @return
     */
    @RequestMapping("test")
    public String getString(){
        return dev+"--->"+test.getName()+": "+test.getAge();
    }

    /**
     * 登录之后才能进入(需要经过拦截才能访问)
     * @param age
     * @return
     */
    @RequestMapping("index/{age}")
    public String getIndex(@PathVariable String age){
        return dev+"--->"+age;
    }

    /**
     * 未登录访问其他接口,则跳转此接口
     * @param name
     * @return
     */
    @RequestMapping("error/{name}")
    public String getError(@PathVariable String name){
        return name+"error";
    }

    /**
     * 登录接口,不用拦截
     * @param name
     * @return
     */
    @RequestMapping("login/{name}")
    public String getLogin(@PathVariable String name){
        return name+"login";
    }

}
