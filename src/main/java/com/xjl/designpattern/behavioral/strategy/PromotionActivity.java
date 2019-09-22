package com.xjl.designpattern.behavioral.strategy;

/**
 *  促销活动 2019/9/22.
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public  void  ExecutePromotion(){
        promotionStrategy.doPromotion();
    }
}