package com.xjl.designpattern.behavioral.strategy;

/**
 *  促销策略实现 on 2019/9/22.
 */
public class CuXiaoPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("促销策略实现");
    }
}
