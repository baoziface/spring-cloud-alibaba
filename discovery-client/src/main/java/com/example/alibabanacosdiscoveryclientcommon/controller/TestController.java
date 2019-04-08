package com.example.alibabanacosdiscoveryclientcommon.controller;

import com.example.alibabanacosdiscoveryclientcommon.HelloRemote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @createBy guoqiang
 * @createTime 2019/4/3
 * @describe
 */
@RestController
@Slf4j
public class TestController {
//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//    @RequestMapping("/test")
//    public String test(String name){
//        ServiceInstance serviceInstance=loadBalancerClient.choose("alibaba-nacos-discovery-server");
//        String url=serviceInstance.getUri()+"/hello?name="+name;
//        RestTemplate restTemplate=new RestTemplate();
//        String result=restTemplate.getForObject(url,String.class);
//        return  "Invoke :"+url+",result:"+result;
//    }
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/test")
    public String test(String name)  {
        log.info("the name is " + name);
        if("retry".equals(name)){
            throw new RuntimeException("error");
        }

        return  helloRemote.hello(name);
    }
    @RequestMapping("/foo")
    public String foo(String foo){
        return  helloRemote.foo(foo);
    }
}
