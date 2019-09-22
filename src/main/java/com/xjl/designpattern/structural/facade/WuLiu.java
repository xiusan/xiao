package com.xjl.designpattern.structural.facade;

/**
 * Created by Administrator on 2019/9/16.
 */
public class WuLiu {

    public String    jiaYan(LuWu luWu){
        String orderNum = "00000";
        System.out.println(luWu.getName()+"进入物理系统,订单号为"+orderNum);
        return orderNum;
    }
}
