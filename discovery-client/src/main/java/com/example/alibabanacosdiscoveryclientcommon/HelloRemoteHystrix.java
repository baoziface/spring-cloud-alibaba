package com.example.alibabanacosdiscoveryclientcommon;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @createBy guoqiang
 * @createTime 2019/3/9
 * @describe
 */
@Component
public class HelloRemoteHystrix implements  HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello "+name+" this message  is  from fallback hello()";
    }

    @Override
    public String foo(String foo) {
        return "hello "+foo+" this message  is  from fallback foo()";
    }

}
