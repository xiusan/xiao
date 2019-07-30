package com.xjl.thread;

/**
 * Created by Administrator on 2019/7/18.
 */
public class CorrThrend {

    public static void main(String[] args) {
        RunnbleKaiShi runnable1 = new RunnbleKaiShi("runnable1");
        RunnbleKaiShi runnable2 = new RunnbleKaiShi("runnable2");
        RunnbleKaiShi runnable3 = new RunnbleKaiShi("runnable3");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        thread1.start();
        thread2.start();
        thread3.start();
        ThrendKaiShi thrend1 = new ThrendKaiShi("thrend1");
        ThrendKaiShi thrend2 = new ThrendKaiShi("thrend2");
        ThrendKaiShi thrend3 = new ThrendKaiShi("thrend3");

    }
}
