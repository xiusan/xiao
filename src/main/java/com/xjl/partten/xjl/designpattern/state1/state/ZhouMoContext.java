package com.xjl.partten.xjl.designpattern.state1.state;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/14 16:15
 * @Description:
 */

public class ZhouMoContext {
    private ZhouMoState zhouMoState;

    public ZhouMoState getZhouMoState() {
        return zhouMoState;
    }

    public void setZhouMoState(ZhouMoState zhouMoState) {
        this.zhouMoState = zhouMoState;
        this.zhouMoState.setZhouMoContext(this);
    }

    public  static final   Eat EAT =  new Eat();
    public  static final   LookVideo LOOKVIDEO =  new LookVideo();
    public  static final   Sleep SLEEP =  new Sleep();


    public void eat(){
        zhouMoState.eat();
    }
    public void lookVideo(){
        zhouMoState.lookVideo();
    }
    public void sleep(){
        zhouMoState.sleep();
    }







}
