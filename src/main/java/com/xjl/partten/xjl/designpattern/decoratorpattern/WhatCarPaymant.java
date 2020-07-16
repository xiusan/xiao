package com.xjl.partten.xjl.designpattern.decoratorpattern;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/16 22:30
 * @Description:
 */

public class WhatCarPaymant implements Payment{

    protected Payment payment;

    public WhatCarPaymant(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void sellMoney() {
        payment.sellMoney();
    }
}
