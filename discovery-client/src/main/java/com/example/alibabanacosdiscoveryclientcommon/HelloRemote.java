package com.example.alibabanacosdiscoveryclientcommon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @createBy guoqiang
 * @createTime 2019/3/9
 * @describe
 */
@FeignClient(name = "alibaba-nacos-discovery-server",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
    @RequestMapping(value = "/foo")
    String foo(@RequestParam(value = "foo") String foo);
}


