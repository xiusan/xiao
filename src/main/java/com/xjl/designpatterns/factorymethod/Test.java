package com.xjl.designpatterns.factorymethod;

/**
 * Created by Administrator on 2019/7/29.
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PathonFactory();
        Video video =  videoFactory.start();
        video.start();
        VideoFactory java= new JavaFactory();
        Video javasd =  java.start();
        javasd.start();
        VideoFactory C = new CFactory();
        Video c  =   C.start();
        c.start();
    }
}
