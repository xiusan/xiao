package com.xjl.singleton;

/**
 * Created by Administrator on 2019/6/30.
 * 饿汉模式
 */
public class HungerSingleton {
   static  HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton() {
    }

    public HungerSingleton  getInstance( ) {
        return hungerSingleton;
    }
}
