package com.xjl.testde.weiguan;

/**
 * Created by Administrator on 2019/10/22.
 */
public  abstract class LiwuService {
    protected Jifen jifen;
    protected  Wuliu wuliu;
    protected   ZhiFu zhiFu;

    public void setJifen(Jifen jifen) {
        this.jifen = jifen;
    }

    public void setWuliu(Wuliu wuliu) {
        this.wuliu = wuliu;
    }

    public void setZhiFu(ZhiFu zhiFu) {
        this.zhiFu = zhiFu;
    }
    public abstract void LiwuService(LiWu liWu);
}
