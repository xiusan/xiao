package com.xjl.partten.xjl.designpattern.templatepattern;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 14:38
 * @Description:
 */

public class PlaneOrderImpl extends OrderService {
    @Override
    void init(Order order) {
        System.out.println("PlaneOrderImpl---->> Init"+order.getName());
        order.setName("3");
    }

    @Override
    void searchRoom(Order order) {
        System.out.println("PlaneOrderImpl---->> searchRoom"+order.getName());
        order.setName("4");
    }

    @Override
    void payOrder(Order order) {
        System.out.println("PlaneOrderImpl---->> payOrder"+order.getName());
        order.setName("4");
    }

    @Override
    void submitOrder(Order order) {
        System.out.println("PlaneOrderImpl---->> submitOrder"+order.getName());
    }
}
