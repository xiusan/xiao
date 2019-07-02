package com.xjl.designpatterns.closeopen;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/26 0026.
 * @Version 1.0
 * 价钱变化  折扣额度
 * 修改业务满足需求
 */
public class JavaDisCountCouse  extends JavaCouse {
    public JavaDisCountCouse(String id, String name, Double price) {
        super(id, name, price);
    }
    //原始价钱

    public Double getPratten() {
        return super.getPrice();
    }

    //折扣价钱
    public Double getDisCountPrice(){
        return getPratten()*0.87;
    }













}
