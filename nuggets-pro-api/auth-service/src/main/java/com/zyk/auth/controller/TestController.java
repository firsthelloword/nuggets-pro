package com.zyk.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyongkai
 * @date 2023/4/16 18:45
 */
@RestController
@RequestMapping("user")
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "user";
    }
}
