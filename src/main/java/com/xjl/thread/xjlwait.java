package com.xjl.thread;

/**
 * Created by Administrator on 2019/7/18.
 */
public class xjlwait implements  Runnable{
   private String valeu;


    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        valeu = "look like ";
    }

    public static void main(String[] args) {
       xjlwait xjl = new xjlwait();
        Thread thread = new Thread(xjl);
        thread.start();
       while (xjl.valeu == null){
           try {
               Thread.currentThread().sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        System.out.println("value="+xjl.valeu);



    }

}
