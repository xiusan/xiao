package com.xjl.designpattern.behavioral.strategy;

/**
 *  打折策略实现 on 2019/9/22.
 */
public class DaZhePromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("打折策略实现");
    }
}
