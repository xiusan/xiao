package com.xjl.partten.xjldemo.singleton;



/**
 * Created by Administrator on 2019/11/20.
 */
public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
    }
}
