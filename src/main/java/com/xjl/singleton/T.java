package com.xjl.singleton;

/**
 * Created by Administrator on 2019/6/29.
 */
public class T  implements Runnable{
    @Override
    public void run() {
        LazySingloton lazySingleton = LazySingloton.getInstanse();
        System.out.println(Thread.currentThread().getName()+"  "+lazySingleton);
    }
}
