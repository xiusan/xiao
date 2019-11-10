package com.xjl.testde.weiguan;

/**
 * Created by Administrator on 2019/10/22.
 */
public class LiWuServiceImp extends  LiwuService{




    @Override
    public void LiwuService(LiWu liWu) {
        if(jifen.getJiFen(liWu)){
            System.out.println("积分满足");
        } if(zhiFu.getZhiFu(liWu)){
            System.out.println("支付成功");
        } if(wuliu.getWuliu(liWu)){
            System.out.println("物流已发货");
        }
    }
}
