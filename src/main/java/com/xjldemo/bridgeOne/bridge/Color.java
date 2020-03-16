package com.xjldemo.bridgeOne.bridge;

/**
 * Created by Administrator on 2019/11/16.
 */
public  abstract   class Color {
    private SunWuKong sunWuKong;

    public void setSunWuKong(SunWuKong sunWuKong) {
        this.sunWuKong = sunWuKong;
    }

    public SunWuKong getSunWuKong() {
        return sunWuKong;
    }

    public abstract  void  StartChange();


}
