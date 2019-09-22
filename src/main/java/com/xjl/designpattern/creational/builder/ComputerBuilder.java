package com.xjl.designpattern.creational.builder;

/**
 * Created by Administrator on 2019/9/13.
 */
public abstract class ComputerBuilder {

        public abstract void builderName(String name);
        public  abstract void builderZhuBan(String zhuBan);
        public  abstract void builderCpu(String cpu);
        public  abstract void builderShowCart(String showCart);
        public abstract  void builderYingPan(String yingPan);
        public abstract  Computer markComputerBuilder();


}
