package interview.nineteen.HaoWeilai.com.xjl.designpattern.state;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/14 16:15
 * @Description:
 */

public class ZhouMoContext {
    private ZhouMoState zhouMoState;

    public final static Eat EAT = new Eat();
    public final static  LookVideo LOOKVIDEO = new LookVideo();
    public final static  Sleep SLEEP = new Sleep();


    public ZhouMoState getZhouMoState() {
        return zhouMoState;
    }

    public void setZhouMoState(ZhouMoState zhouMoState) {
        this.zhouMoState = zhouMoState;
        this.zhouMoState.setState(this);
    }




    void eat() {
        this.zhouMoState.eat();
    }

    void lookVideo() {
        this.zhouMoState.lookVideo();
    }

    void sleep() {
        this.zhouMoState.sleep();
    }
}
