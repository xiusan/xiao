package com.xjl.partten.xjl.designpattern.bridge;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/23 13:10
 * @Description:
 */

public class BMW  extends FatherCar {
    @Override
    public void move() {
        System.out.println("宝马是:");
        super.getGrade().energy();
    }
}
