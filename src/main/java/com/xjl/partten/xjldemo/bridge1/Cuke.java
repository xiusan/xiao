package com.xjl.partten.xjldemo.bridge1;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/20 00:06
 * @Description:
 */

public class Cuke extends CutUpVegetables{
    public Cuke(Light light) {
        super(light);
    }

    @Override
    public void cut() {
        light.shine();
        System.out.println("切黄瓜");
    }
}
