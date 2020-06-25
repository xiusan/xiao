package com.xjl.partten.xjldemo.proxy;

/**
 * Created by xiaojinlu1990@163.partten on 2019/11/26.
 * 代理模式
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage();
        image.display();
    }
}
