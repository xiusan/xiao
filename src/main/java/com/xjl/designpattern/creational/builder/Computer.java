package com.xjl.designpattern.creational.builder;

/**
 * Created by Administrator on 2019/9/13.
 */
public class Computer {

    private String name;
    private String zhuBan;
    private String cpu;
    private String showCart;
    private String yingPan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhuBan() {
        return zhuBan;
    }

    public void setZhuBan(String zhuBan) {
        this.zhuBan = zhuBan;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getShowCart() {
        return showCart;
    }

    public void setShowCart(String showCart) {
        this.showCart = showCart;
    }

    public String getYingPan() {
        return yingPan;
    }

    public void setYingPan(String yingPan) {
        this.yingPan = yingPan;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", zhuBan='" + zhuBan + '\'' +
                ", cpu='" + cpu + '\'' +
                ", showCart='" + showCart + '\'' +
                ", yingPan='" + yingPan + '\'' +
                '}';
    }
}
