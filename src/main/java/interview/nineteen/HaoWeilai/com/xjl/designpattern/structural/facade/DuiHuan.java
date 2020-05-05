package interview.nineteen.HaoWeilai.com.xjl.designpattern.structural.facade;

/**
 * Created by Administrator on 2019/9/16.
 */
public class DuiHuan {

    private KuCun kuCun;
    private JiFen jiFen;
    private ZhiFu zhiFu;
    private WuLiu wuLiu;

    public void   liWu(LuWu luWu){
          KuCun kuCun = new KuCun();
          JiFen jiFen = new JiFen();
          ZhiFu zhiFu = new ZhiFu();
          WuLiu wuLiu = new WuLiu();
        if (kuCun.getLiWuCount(luWu)){
            jiFen.jiaYan();
            zhiFu.kouChu();
            wuLiu.jiaYan(luWu);
        }
    }


}
