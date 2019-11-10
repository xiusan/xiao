package com.xjl.testde.weiguan;

/**
 * Created by Administrator on 2019/10/22.
 */
public class Test {

    public static void main(String[] args) {
        LiWu liWu = new LiWu("苹果");
        LiwuService liwuService = new LiWuServiceImp();
        liwuService.setJifen(new Jifen());
        liwuService.setZhiFu(new ZhiFu());
        liwuService.setWuliu(new Wuliu());
        liwuService.LiwuService(liWu);
    }
}
