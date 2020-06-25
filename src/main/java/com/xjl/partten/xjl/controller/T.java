package com.xjl.partten.xjl.controller;

/**
 * Created by Administrator on 2019/7/1.
 */
public class T  implements Runnable{
    private  int out;

    public T(int oo) {
        this.out=oo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("开始10000"+Thread.currentThread().getName()+"=="+out);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
