package com.xjl.designpattern.creational.singleton;

/**
 * 懒汉模式 on 2019/9/14.
 *
 */
public class StaticInnerSingleton {

    public StaticInnerSingleton() {
    }

    public static class InnerClass  {
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }
    public  static StaticInnerSingleton getInstance(){
        return InnerClass.staticInnerSingleton;
    }
}
