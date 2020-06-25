package com.xjl.partten.xjldemo.bridge1;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/20 00:05
 * @Description:
 */

public  abstract class CutUpVegetables {
    protected Light light;

    public CutUpVegetables(Light light) {
        this.light = light;
    }

    abstract void   cut();

}
