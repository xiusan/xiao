package com.xjl.designpattern.creational.singleton;

/**
 * 懒汉模式() on 2019/9/14.
 * 多线程DoubleChack  会重复创建对象的问题
 */
public class LazyDoubleChackSingleton {
    private volatile static LazyDoubleChackSingleton lazyDoubleChackSingleton;
    public LazyDoubleChackSingleton() {
    }
    public  static LazyDoubleChackSingleton getInstance(){
            if (lazyDoubleChackSingleton == null){
                synchronized (LazyDoubleChackSingleton.class){
                    if (lazyDoubleChackSingleton == null){
                        lazyDoubleChackSingleton = new LazyDoubleChackSingleton();
                        //内存模型（可能会重排序）
                        // 1 分配内存空间
                        // 2 创建实例（初始化对象）
                        // 3 指向对象
                        // intra-Thread semantics 规则 （提高效率）


                    }
                }
            }
        return lazyDoubleChackSingleton;
    }
}
