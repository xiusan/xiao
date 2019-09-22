package com.xjl.designpattern.creational.singleton;

/**
 * Created by Administrator on 2019/9/14.
 */
public class T implements Runnable {
    @Override
    public void run() {
      //  LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleChackSingleton lazyDoubleChackSingleton = new LazyDoubleChackSingleton();
        System.out.println(Thread.currentThread().getName()+",内存地址："+lazyDoubleChackSingleton);
    }
}
