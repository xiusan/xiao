package com.xjl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/11/011.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("开始");
       Thread thread = new Thread(new T());
        thread.start();
        System.out.println("结束");
    return  "succ";
    }
}
