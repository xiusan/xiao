package com.xjl.partten.xjldemo.strategy;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/13 22:11
 * @Description:
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void  algorithmic(int num1, int num2){
        strategy.doOperation(num1, num2);
    }

}
