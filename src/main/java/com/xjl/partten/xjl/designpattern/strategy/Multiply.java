package com.xjl.partten.xjl.designpattern.strategy;

/**
 * Created by Administrator on 2020/7/8.
 */
public class Multiply  implements Strategy{
    @Override
    public void doSomeThing(int a,int b) {
        System.out.printf("a * b="+(a*b));
    }
}
