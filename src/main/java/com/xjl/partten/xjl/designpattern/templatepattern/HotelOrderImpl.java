package com.xjl.partten.xjl.designpattern.templatepattern;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 14:38
 * @Description:
 */

public class HotelOrderImpl extends OrderService {
    @Override
    void init(Order order) {
        System.out.println("HotelOrderImpl---->> Init"+order.getName());
    }

    @Override
    void searchRoom(Order order) {
        System.out.println("HotelOrderImpl---->> searchRoom"+order.getName());
    }

    @Override
    void payOrder(Order order) {
        System.out.println("HotelOrderImpl---->> payOrder"+order.getName());
    }

    @Override
    void submitOrder(Order order) {
        System.out.println("HotelOrderImpl---->> submitOrder"+order.getName());
    }
}
