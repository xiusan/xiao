package interview.nineteen.HaoWeilai.com.xjl.designpattern.structural.facade;

/**
 *  外观模式（门面模式） 2019/9/16.
 *  定义：提供一个统一的接口，来访问子系统的一群接口；
 *
 *
 *
 *  应用场景实例：积分兑换系统
 *
 */
public class Test {

    public static void main(String[] args) {
        DuiHuan duiHuan = new DuiHuan();
        duiHuan.liWu(new LuWu("衣服"));
    }
}
