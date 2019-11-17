package com.xjldemo;

/**
 * Created by Administrator on 2019/11/16.
 */
public class Demo {
    public static void main(String[] args) {
        DecoratorStart decoratorStart = new DecoratorStart();
        decoratorStart.setSunWuKong(new SiMiao());
        decoratorStart.Change();
        decoratorStart.setSunWuKong(new Bird());
        decoratorStart.Change();


    }
}
