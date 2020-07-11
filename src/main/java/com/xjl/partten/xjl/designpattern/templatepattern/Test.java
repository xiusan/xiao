package com.xjl.partten.xjl.designpattern.templatepattern;

/**
 * 模板模式
 * 一些方法通用，却在每一个子类都重新写了这一方法
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 14:27
 * @Description:
 */

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setName("2");
        order.setId(2);

        OrderService hotelOrder = new HotelOrderImpl();
        hotelOrder.play(order);

        OrderService planeOrder = new PlaneOrderImpl();
        planeOrder.play(order);
    }
}
