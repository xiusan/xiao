package com.xjl.designpatterntest.factory.SimpleFactory;

/**
 * Created by Administrator on 2019/10/16.
 */
public class OldMen  implements Men {
    @Override
    public void eat() {
        System.out.println("老人eat");
    }

    @Override
    public void work() {
        System.out.println("老人work");
    }

    @Override
    public void spreak() {
        System.out.println("老人work");
    }
}