package com.xjl.partten.xjldemo.bridgeOne.bridge;

/**
 * Created by xiaojinlu1990@163.partten on 2019/12/2.
 */
public class Green extends Color{
    @Override
    public void StartChange() {
        System.out.println("Green");
        super.getSunWuKong().change();
    }
}
