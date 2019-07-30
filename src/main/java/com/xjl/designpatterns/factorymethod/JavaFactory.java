package com.xjl.designpatterns.factorymethod;

/**
 * Created by Administrator on 2019/7/29.
 */
public class JavaFactory  extends VideoFactory {
    @Override
    public Video start() {
        return new JavaVideo();
    }
}
