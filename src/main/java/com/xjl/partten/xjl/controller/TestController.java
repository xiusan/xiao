package com.xjl.partten.xjl.controller;

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
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = new Thread(new T(0));
        thread.start();
        System.out.println("结束");
    return  "succ";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        System.out.println("开始2");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(new T(2));
        thread.start();
        System.out.println("结束2");
        return  "succ2";
    }
    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        System.out.println("开始1");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(new T(1));
        thread.start();
        System.out.println("结束1");
        return  "succ1";
    }
    @RequestMapping("/test3")
    public  void findAllThread(){
        ThreadGroup currentGroup =Thread.currentThread().getThreadGroup();

        while (currentGroup.getParent()!=null){
            // 返回此线程组的父线程组
            currentGroup=currentGroup.getParent();
        }
        //此线程组中活动线程的估计数
        int noThreads = currentGroup.activeCount();

        Thread[] lstThreads = new Thread[noThreads];
        //把对此线程组中的所有活动子组的引用复制到指定数组中。
        currentGroup.enumerate(lstThreads);

        for (Thread thread : lstThreads) {
            System.out.println("线程数量："+noThreads+" 线程id：" + thread.getId() + " 线程名称：" + thread.getName() + " 线程状态：" + thread.getState());
        }
    }

    @RequestMapping("/test5")
    public  void findAllThread5(){
    }
}
