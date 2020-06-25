package com.xjl.partten.xjldemo.bridge1;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/20 00:07
 * @Description:
 */

public class whiteGourd extends CutUpVegetables{

    public whiteGourd(Light light) {
        super(light);
    }

    @Override
    void cut() {
        light.shine();
        System.out.println("切冬瓜");
    }

}
