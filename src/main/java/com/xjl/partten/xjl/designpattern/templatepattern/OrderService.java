package com.xjl.partten.xjl.designpattern.templatepattern;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 14:32
 * @Description:
 */

public abstract class OrderService {

    abstract void init(Order order);

    abstract void searchRoom(Order order);

    abstract void payOrder(Order order);

    abstract void submitOrder(Order order);


    public void play(Order order){
        init(order);

        searchRoom(order);

        payOrder(order);

        submitOrder(order);
    }

}
