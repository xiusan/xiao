package com.xjldemo.singleton;

/**
 * Created by Administrator on 2019/11/20.
 */
public class T implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(Thread.currentThread().getName()+"  "+singleton.getClass()+"  "+singleton.toString());
    }
}
