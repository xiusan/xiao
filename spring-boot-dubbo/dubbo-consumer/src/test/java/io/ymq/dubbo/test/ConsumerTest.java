package io.ymq.dubbo.test;

import io.xjl.dubbo.consumer.Startup;
import io.xjl.dubbo.consumer.service.ConsumerDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述: 测试消费远程服务
 *
 * @author xiaojinlu
 * @create 2017-10-27 14:15
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
public class ConsumerTest {

    @Autowired
    private ConsumerDemoService consumerDemoService;

    @Test
    public void sayHello(){
        consumerDemoService.sayHello("Peng Lei");
    }
}
