package com.xjl.thread;

/**
 * Created by Administrator on 2019/7/18.
 */
public class ThrendKaiShi extends Thread{

    private  String  name;

    public ThrendKaiShi(String name) {
        this.name = name;
    }


    public void excutors() {
        System.out.println("Thread name is "+name);
    }
}
