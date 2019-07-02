package com.xjl.singleton;

/**
 * Created by Administrator on 2019/6/30.
 * 饿汉模式
 */
public class HungerSingleton {
   static  HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton() {
        if(hungerSingleton != null){
            new RuntimeException("not new refalse");
        }
    }

    public HungerSingleton  getInstance( ) {
        return hungerSingleton;
    }
}
