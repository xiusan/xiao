package com.xjl.partten.xjldemo.decorator;

/**
 * Created by Administrator on 2019/11/18.
 */
public class ABCBank extends Bank{

    @Override
    public void getCode() {
        System.out.println("农业银行卡号");
    }
}
