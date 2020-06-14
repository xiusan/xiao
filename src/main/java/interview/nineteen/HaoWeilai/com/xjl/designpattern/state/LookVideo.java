package interview.nineteen.HaoWeilai.com.xjl.designpattern.state;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/14 16:21
 * @Description:
 */

public class LookVideo extends ZhouMoState{

    @Override
    void eat() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.EAT);
        this.getZhouMoContext().eat();
    }

    @Override
    void lookVideo() {
        System.out.println("开始看电影。。");
    }

    @Override
    void sleep() {
        this.getZhouMoContext().setZhouMoState(ZhouMoContext.SLEEP);
        this.getZhouMoContext().eat();
    }
}
