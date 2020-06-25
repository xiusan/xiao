package com.xjl.partten.xjldemo.template;

/**
 * Created by Administrator on 2019/11/19.
 */
public class Basketball extends Game{
    @Override
    void inte() {
        System.out.println("篮球初始化");

    }

    @Override
    void start() {
        System.out.println("篮球开始");
    }

    @Override
    void end() {
        System.out.println("篮球结束");
    }
}
