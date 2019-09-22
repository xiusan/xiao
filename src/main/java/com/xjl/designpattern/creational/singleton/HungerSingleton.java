package com.xjl.designpattern.creational.singleton;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

/**
 *  饿汉式 on 2019/9/14.
 *  1 类初始化就就实例化对象，不存在多线程安全问题
 *  2 占用固定内存，可能整个周期都没有用，对资源产生浪费
 */
public class HungerSingleton implements Serializable{
    private final static    HungerSingleton hungerSingleton ;

    static {
        hungerSingleton = new HungerSingleton();
    }

    public static HungerSingleton getInstabce() {
        return hungerSingleton;
    }

    public HungerSingleton() {
        if (hungerSingleton != null){
           throw  new RuntimeException("不允许反射调用");
        }
    }

    public Object readResolve(){
        return hungerSingleton;
    }



}
