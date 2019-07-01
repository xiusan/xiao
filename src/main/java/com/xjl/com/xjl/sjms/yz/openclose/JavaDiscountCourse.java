package com.xjl.com.xjl.sjms.yz.openclose;

/**
 * Created by Administrator on 2019/6/30.
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(String id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return getPrice()*20;
    }
}
