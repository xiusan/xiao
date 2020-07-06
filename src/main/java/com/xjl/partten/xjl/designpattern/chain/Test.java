package com.xjl.partten.xjl.designpattern.chain;

/**
 * Created by Administrator on 2020/7/6.
 */
public class Test {

    public static void main(String[] args) {
        Handler handler = new JingLi();
        PiZhun piZhun = new PiZhun();
        piZhun.setJiaotian("ee");
        piZhun.setLiyou("ttt");
        handler.setggHandler(new  Ceo());
        handler.doPoly(piZhun);
    }
}
