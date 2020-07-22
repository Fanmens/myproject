package com.feynman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellospringboot {

    @RequestMapping("/hello")
    public String print() {
        return "hello world";
        //测试一下github提交好不好使

    }
}
