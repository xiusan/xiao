package com.xjldemo;

/**
 * Created by Administrator on 2019/11/16.
 */
public class DecoratorStart {
    private  SunWuKong sunWuKong;

    public void setSunWuKong(SunWuKong sunWuKong) {
        this.sunWuKong = sunWuKong;
    }

    public void  Change(){
        StartChange();
        sunWuKong.change();
    }
    private void  StartChange(){
        System.out.println("开始：");
    }


}
