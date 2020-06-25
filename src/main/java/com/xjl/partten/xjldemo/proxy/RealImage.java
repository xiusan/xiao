package com.xjl.partten.xjldemo.proxy;

/**
 * Created by xiaojinlu1990@163.partten on 2019/11/26.
 */
public class RealImage  implements Image{
    @Override
    public void display() {
        System.out.println("red");
    }
}
