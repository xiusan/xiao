package com.xjl.partten.xjl.designpattern.strategy;

/**
 * Created by Administrator on 2020/7/8.
 */
public class StrategyContext {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(int a, int b){
        strategy.doSomeThing(a,   b);
    }

}
