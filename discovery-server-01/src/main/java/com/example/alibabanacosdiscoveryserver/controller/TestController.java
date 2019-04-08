package com.example.alibabanacosdiscoveryserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createBy guoqiang
 * @createTime 2019/4/3
 * @describe
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return  "hello 2 "+name;
    }
    @RequestMapping("/foo")
    public String foo(String foo){
        return  "hello 2"+foo;
    }
}
