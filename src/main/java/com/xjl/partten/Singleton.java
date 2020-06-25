package com.xjl.partten;

/**
 * 单利模式编码
 *  抽象：
 *      1.自我实例引用
 *      2.私有的构造方法
 *      3.公共的使用方法
 *  问题：
 *      1：多实例化
 *      2：反射攻击
 *      3：线程安全
 */
public class Singleton {
    private static Singleton singleton;

    public Singleton() {}

    public static Singleton  getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }



}
