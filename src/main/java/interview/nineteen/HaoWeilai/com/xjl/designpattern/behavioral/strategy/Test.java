package interview.nineteen.HaoWeilai.com.xjl.designpattern.behavioral.strategy;

/**
 * Created by Administrator on 2019/9/22.
 */
public class Test {

    public static void main(String[] args) {
    //简单式
/*        PromotionActivity promotionActivity = null;
        String LeiXing = "CuXiao";
        if (StringUtils.equals(LeiXing,"CuXiao")){
            promotionActivity = new PromotionActivity(new CuXiaoPromotionStrategy());
        }else if (StringUtils.equals(LeiXing,"ManJian")){
            promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
        }else {
            promotionActivity = new PromotionActivity(new DaZhePromotionStrategy());
        }
        promotionActivity.ExecutePromotion();*/
    //晋级式工厂模式  去除IF 。。。 else  。。。
        PromotionStrategyFactory promotionStrategyFactory = new PromotionStrategyFactory();

        PromotionStrategy promotionStrategy = promotionStrategyFactory.getPromotionStategy("CuXiao");
        promotionStrategy.doPromotion();
    }
}
