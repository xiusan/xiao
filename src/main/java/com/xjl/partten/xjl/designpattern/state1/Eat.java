package com.xjl.partten.xjl.designpattern.state1;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/14 16:21
 * @Description:
 */

public class Eat  extends ZhouMoState {

    @Override
    void eat() {
        System.out.printf("开始吃饭了。。");

    }

    @Override
    void lookVideo() {
        System.out.printf("开始吃饭了。。不能睡觉");
    }

    @Override
    void sleep() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.SLEEP);
        this.getZhouMoContext().getZhouMoState().sleep();

    }
}
