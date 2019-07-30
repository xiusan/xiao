package com.xjl.designpatterns.factorymethod;

/**
 * Created by Administrator on 2019/7/29.
 */
public class CFactory  extends VideoFactory {
    @Override
    public Video start() {
        return new CVideo();
    }
}
