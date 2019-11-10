package com.xjl.designpatterntest.factory.SimpleFactory;

/**
 * Created by Administrator on 2019/10/16.
 */
public class ALittleMen implements Men {
    @Override
    public void eat() {
        System.out.println("小孩eat");
    }

    @Override
    public void work() {
        System.out.println("小孩work");
    }

    @Override
    public void spreak() {
        System.out.println("小孩work");
    }
}
