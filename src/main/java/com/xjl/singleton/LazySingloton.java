package com.xjl.singleton;

/**
 * Created by Administrator on 2019/6/29.
 */
public class LazySingloton {
    private static LazySingloton lazySingloton =null;
    private  LazySingloton() {

    }
    public static  LazySingloton getInstanse(){
        if(lazySingloton ==null){
            synchronized (LazySingloton.class){
                if (lazySingloton == null){
                    lazySingloton = new LazySingloton();
                }
            }
        }
        return lazySingloton;
    }


}
