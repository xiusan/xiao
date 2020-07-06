package com.xjl.partten.xjl.designpattern.state1;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/14 16:21
 * @Description:
 */

public class LookVideo extends ZhouMoState {

    @Override
    void eat() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.LOOKVIDEO);
        this.getZhouMoContext().getZhouMoState().eat();
    }

    @Override
    void lookVideo() {
        System.out.printf("开始看电影。。");
    }

    @Override
    void sleep() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.SLEEP);
        this.getZhouMoContext().getZhouMoState().sleep();

    }
}
