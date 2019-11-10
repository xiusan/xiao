package com.xjl.designpatterntest.factory.SimpleFactory;

/**
 * Created by Administrator on 2019/10/16.
 * 简单工厂模式
 * 利用反射去除if else  操作
 *
 */
public class SimpleFactory {

    public Men getMen(Class classNeme) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Men men = (Men) classNeme.newInstance();
        return men;

    }
}

