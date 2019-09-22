package com.xjl.designpattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  恶汉模式反射攻击与防御on 2019/9/14.
 */
public class TestRrflexHunger {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    Class object  = HungerSingleton.class;
    Constructor constructor =object.getDeclaredConstructor();
    constructor.setAccessible(true);

    HungerSingleton hungerSingleton = HungerSingleton.getInstabce();
    HungerSingleton objectSingleton = (HungerSingleton) constructor.newInstance();

    System.out.println(hungerSingleton);
    System.out.println(objectSingleton);
    System.out.println(objectSingleton == hungerSingleton);



    }
}
