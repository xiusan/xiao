package com.xjl.partten.xjldemo.visit;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/24 21:47
 * @Description:
 */

public class Visiter  implements Visit{


    @Override
    public void visit(JavaL javaL) {
        System.out.println("我是javaL");

    }

    @Override
    public void visit(Php php) {
        System.out.println("我是php");
    }
}
