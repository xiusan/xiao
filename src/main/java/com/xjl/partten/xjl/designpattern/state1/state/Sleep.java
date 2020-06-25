package com.xjl.partten.xjl.designpattern.state1.state;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/14 16:21
 * @Description:
 */

public class Sleep extends ZhouMoState {

    @Override
    void eat() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.LOOKVIDEO);
        this.getZhouMoContext().getZhouMoState().eat();
    }

    @Override
    void lookVideo() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.LOOKVIDEO);
        this.getZhouMoContext().getZhouMoState().lookVideo();

    }

    @Override
    void sleep() {
        System.out.printf("开始睡觉。。");

    }
}
