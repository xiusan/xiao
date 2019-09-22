package com.xjl.designpattern.creational.singleton;

/**
 *  单例模式 on 2019/9/14.
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

    }

}
