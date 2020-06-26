package io.xjl.dubbo.consumer.web;

/**
 * 描述:
 *
 * @author xiaojinlu
 * @create 2018-07-25 17:25
 **/

import io.xjl.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoConsumerController {

    @Resource
    private DemoService demoService;

    @PostMapping("/sayHello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}