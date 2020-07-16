package com.xjl.partten.xjl.designpattern.decoratorpattern;

/**
 *
 * 给一类方法加上某个功能
 *
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/16 22:25
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        Payment payment = new CarPayment();
        payment.sellMoney();
        Payment pay = new WhatCarPaymant(new GetMoneyDecorator(new CarPayment()));
        pay.sellMoney();
    }
}
