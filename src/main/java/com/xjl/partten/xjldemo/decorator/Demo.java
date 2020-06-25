package com.xjl.partten.xjldemo.decorator;

/**
 * 装饰者
 * 抽象，实现，分离，独自变化
 */
public class Demo {

    public static void main(String[] args) {
        Bank bank = new ABCBank();
        Accute accute = bank.getAccute(new HuoQi());
        bank.getCode();
        accute.getLiXi();
    }
}
