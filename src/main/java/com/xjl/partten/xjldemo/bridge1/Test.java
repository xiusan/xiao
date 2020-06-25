package com.xjl.partten.xjldemo.bridge1;

/**
 * 场景 ：晚上做饭   打开灯-》红灯 和绿灯
 *                 切菜 -》 黄瓜 冬瓜
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/19 23:58
 * @Description: 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 */

public class Test {


    public static void main(String[] args) {
        CutUpVegetables cutUpVegetables = new Cuke(new RedLight());
        cutUpVegetables.cut();

        CutUpVegetables whiteGourd = new whiteGourd(new GreenLight());
        whiteGourd.cut();
    }
}
