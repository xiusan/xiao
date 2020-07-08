package com.xjl.partten.xjl.designpattern.strategy;

/**
 * 策略模式
 * 场景，行为相同里面的操作不同适用此算法
 * Created by Administrator on 2020/7/8.
 */
public class Test {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();
                context.setStrategy(new Multiply());
                context.doStrategy(1,2);
    }
}
