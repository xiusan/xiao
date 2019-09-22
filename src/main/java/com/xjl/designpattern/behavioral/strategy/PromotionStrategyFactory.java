package com.xjl.designpattern.behavioral.strategy;

import java.util.HashMap;

/**
 *  满减策略实现 2019/9/22.
 */
public class PromotionStrategyFactory   {
    public PromotionStrategyFactory() {
    }

    private static HashMap<String,PromotionStrategy> hashMap = new HashMap<String,PromotionStrategy>();

    static {
        hashMap.put(CeLue.CUXIAO,new CuXiaoPromotionStrategy());
        hashMap.put(CeLue.DAZHE,new DaZhePromotionStrategy());
        hashMap.put(CeLue.MANJIAN,new ManJianPromotionStrategy());
    }

    public  interface CeLue{
        String CUXIAO ="CuXiao";
        String DAZHE ="DaZhe";
        String MANJIAN ="ManJian";
    }

    public PromotionStrategy  getPromotionStategy(String ceLue){
        PromotionStrategy promotionStrategy= hashMap.get(ceLue);
        return hashMap.get(ceLue) == null?new EmptyPromotionStrategy(): promotionStrategy;
    }


}
