package com.xjl.partten.xjldemo.bridge1;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/20 00:02
 * @Description:
 */

public class RedLight  implements Light {
    @Override
    public void shine() {
        System.out.println("发出红光");
    }

}