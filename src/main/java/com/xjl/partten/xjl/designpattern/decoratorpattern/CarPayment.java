package com.xjl.partten.xjl.designpattern.decoratorpattern;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/16 22:27
 * @Description:
 */

public class CarPayment implements  Payment {
    @Override
    public void sellMoney() {
        System.out.println("买了辆车");
    }
}
