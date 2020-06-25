package com.xjl.partten.xjldemo.proxy;

/**
 * Created by xiaojinlu1990@163.partten on 2019/11/26.
 */
public class ProxyImage implements Image{

    @Override
    public void display() {
        RealImage realImage = new RealImage();
        realImage.display();
    }
}
