package com.xjl.designpattern.creational.methodfactory;


/**
 * Created by Administrator on 2019/9/13.
 */
public class JavaVideoFactroy extends VideoFactroy{


    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
