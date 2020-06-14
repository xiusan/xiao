package interview.nineteen.HaoWeilai.com.xjl.designpattern.state;

/**
 * 场景周末
 * 1 吃饭
 * 2 看电影
 * 3 睡觉
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/14 16:15
 * @Description:
 */

public abstract class ZhouMoState {
    private ZhouMoContext zhouMoContext;

    public void setState(ZhouMoContext zhouMoContext) {
        this.zhouMoContext = zhouMoContext;
    }

    public ZhouMoContext getZhouMoContext() {
        return zhouMoContext;
    }

    abstract  void  eat();
    abstract  void  lookVideo();
    abstract  void  sleep();


}
