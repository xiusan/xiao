package interview.nineteen.HaoWeilai.com.xjl.designpattern.state;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/14 16:21
 * @Description:
 */

public class Sleep extends ZhouMoState{

    @Override
    void eat() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.EAT);
        this.getZhouMoContext().eat();
    }

    @Override
    void lookVideo() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.LOOKVIDEO);
        this.getZhouMoContext().lookVideo();
    }

    @Override
    void sleep() {
        System.out.println("开始睡觉。。");
    }
}
