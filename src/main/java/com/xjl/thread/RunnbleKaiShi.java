package com.xjl.thread;

/**
 * Created by Administrator on 2019/7/18.
 */
public class RunnbleKaiShi  implements Runnable{

    private  String  name;

    public RunnbleKaiShi(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable name is "+name);
        }

    }
}
