package com.xjl.designpatterns.factorymethod;

/**
 * Created by Administrator on 2019/7/29.
 */
public class CVideo extends Video{
    @Override
    public void start() {
        System.out.println("----开始生产C----");
    }
}
