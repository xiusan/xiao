package com.xjl.partten.xjl.designpattern.state1.state;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/14 16:31
 * @Description:
 */

public class Test {

    public static void main(String[] args) {
        ZhouMoContext zhouMoContext = new ZhouMoContext();
        zhouMoContext.setZhouMoState(new Eat());
        zhouMoContext.eat();
        zhouMoContext.lookVideo();
        System.out.println(zhouMoContext.getZhouMoState().getClass().getSimpleName());
        zhouMoContext.lookVideo();
        System.out.println(zhouMoContext.getZhouMoState().getClass().getSimpleName());
        zhouMoContext.sleep();
        System.out.println(zhouMoContext.getZhouMoState().getClass().getSimpleName());






    }
}
