package com.xjl.partten.xjldemo.strategy;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/13 22:03
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new Multiply());
        context.algorithmic(2,3);
    }
}
