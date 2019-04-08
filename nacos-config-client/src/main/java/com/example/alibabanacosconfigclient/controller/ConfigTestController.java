package com.example.alibabanacosconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createBy guoqiang
 * @createTime 2019/4/3
 * @describe
 */
@RestController
@RefreshScope
public class ConfigTestController {
    @Value("${guoqspace.title:}")
    String title;
    @Value("${test:}")
    String test;
    @Value("${test2:}")
    String test2;
    @RequestMapping("/test")
    public  String test(){
        //测试默认的格式的配置文件 .properties
        return  title;
    }
    @RequestMapping("/test1")
    public  String test1(){
        //测试默认的格式的配置文件 .properties
        return  test;
    }
    @RequestMapping("/test2")
    public  String test2(){
        //测试yaml格式的配置文件 .yaml
        return  test2;
    }
}
