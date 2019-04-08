package com.example.springgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createBy guoqiang
 * @createTime 2019/4/8
 * @describe
 */
@RestController
public class FallbackController {
    @GetMapping("fallback")
    public String fallback() {
        return "hello this is a fallback from gateway";
    }
}
