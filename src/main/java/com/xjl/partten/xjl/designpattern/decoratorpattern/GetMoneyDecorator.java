package com.xjl.partten.xjl.designpattern.decoratorpattern;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/16 22:37
 * @Description:
 */

public class GetMoneyDecorator extends  WhatCarPaymant{


    public GetMoneyDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void sellMoney() {
        lendMoney();
        payment.sellMoney();

    }

    private void lendMoney(){
        System.out.println("借钱");
    }

}
