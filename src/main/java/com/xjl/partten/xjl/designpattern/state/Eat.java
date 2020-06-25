package com.xjl.partten.xjl.designpattern.state;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/14 16:21
 * @Description:
 */

public class Eat  extends ZhouMoState{

    @Override
    void eat() {
        System.out.println("开始吃饭。。");
    }

    @Override
    void lookVideo() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.LOOKVIDEO);
        this.getZhouMoContext().lookVideo();
    }

    @Override
    void sleep() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.SLEEP);
        this.getZhouMoContext().sleep();
    }
}
