package com.xjl.partten.xjldemo.visit;

/**
 *访问者模式
 * 行为和数据结构分离（访问者模式是一种将数据操作和数据结构分离的设计模式）
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/24 21:31
 * @Description:
 */

public class Test {

    public static void main(String[] args) {
        Visit visit = new  Visiter();
        visit.visit(new Php());
    }
}
