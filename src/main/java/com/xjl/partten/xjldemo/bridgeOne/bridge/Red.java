package com.xjl.partten.xjldemo.bridgeOne.bridge;

/**
 * Created by xiaojinlu1990@163.partten on 2019/12/2.
 */
public class Red extends Color{
    @Override
    public void StartChange() {
        System.out.println("Red");
        super.getSunWuKong().change();
    }
}
