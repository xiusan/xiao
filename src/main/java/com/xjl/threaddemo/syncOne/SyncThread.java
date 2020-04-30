package com.xjl.threaddemo.syncOne;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/11/16.
 */
public class SyncThread implements Runnable {
    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        if(threadName.startsWith("A")){
            sync();
        }else if(threadName.startsWith("B")){
            syncObject1();
        }else if (threadName.startsWith("C")){
            syncObject2();
        }else if (threadName.startsWith("D")){
            syncObject3();
        }else if (threadName.startsWith("E")){
            syncObject4();
        }
    }

    /**
     *
     */
    private void sync(){
        try {
            System.out.println(Thread.currentThread().getName()+"_sync_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"_sync_end:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     *同步代码块{synchronized(this),synchronized(类的实例对象)，锁的是小括号里面的实例对象}
     */
    private void syncObject1(){
        System.out.println(Thread.currentThread().getName()+"_syncObject1"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "_syncObject1_Start:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "_syncObject1_end:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
    /**
     *同步非静态方法{synchronized method}，锁的是当前的实例；
     */
    private synchronized void syncObject2(){
        System.out.println(Thread.currentThread().getName()+"_syncObject2:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            System.out.println(Thread.currentThread().getName()+"_syncObject2_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"_syncObject3_end:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     *同步代码块{synchronized(类.class)，锁的是小括号()中的类对象（class对象）}
     */
    private void syncObject3(){
        System.out.println(Thread.currentThread().getName()+"_syncObject3"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            synchronized (SyncThread.class) {
                System.out.println(Thread.currentThread().getName() + "_syncObject3_Start:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "_syncObject3_end:" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     *同步静态方法{synchronized static method}，锁的是当前类的对象（clas对象）
     */
    private static synchronized void syncObject4(){
        System.out.println(Thread.currentThread().getName()+"_syncObject3:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        try {
            System.out.println(Thread.currentThread().getName()+"_syncObject4_Start:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"_syncObject4_end:"+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
