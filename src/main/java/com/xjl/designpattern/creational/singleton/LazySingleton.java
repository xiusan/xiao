package com.xjl.designpattern.creational.singleton;

/**
 * 懒汉模式 on 2019/9/14.
 *
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    public LazySingleton() {
    }
    public  static LazySingleton getInstance(){
        synchronized (LazySingleton.class){
            if (lazySingleton == null){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
