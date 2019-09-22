package com.xjl.designpattern.behavioral.strategy;

/**
 *  满减策略实现 2019/9/22.
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("空");
    }
}
