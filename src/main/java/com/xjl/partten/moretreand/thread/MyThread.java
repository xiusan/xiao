package com.xjl.partten.moretreand.thread;

import java.util.concurrent.Callable;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/3/21 19:12
 * @Description:
 */

public class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "success";
    }
}
