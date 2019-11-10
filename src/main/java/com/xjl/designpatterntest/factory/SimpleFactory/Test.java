package com.xjl.designpatterntest.factory.SimpleFactory;

/**
 * Created by Administrator on 2019/10/16.
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        SimpleFactory simpleFactory = new SimpleFactory();
        Men men = simpleFactory.getMen(OldMen.class);
        men.eat();
    }
}
