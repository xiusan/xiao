package com.xjl.partten.xjldemo.strategy;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/13 22:08
 * @Description:
 */

public class Multiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        System.out.println( "num1*num2=" + ( num1*num2));
        return num1*num2;
    }
}
