package com.xjl.designpattern.creational.singleton;

/**
 * Created by geely
 */
public enum EnumInstance {
    INSTANCE{
        protected  void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
