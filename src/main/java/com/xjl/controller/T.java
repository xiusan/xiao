package com.xjl.controller;

/**
 * Created by Administrator on 2019/7/1.
 */
public class T  implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("开始10000"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
