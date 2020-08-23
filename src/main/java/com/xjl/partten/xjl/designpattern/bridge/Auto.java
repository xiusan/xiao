package com.xjl.partten.xjl.designpattern.bridge;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/23 13:02
 * @Description:
 */

public class Auto implements Grade {
    @Override
    public void energy() {
        System.out.println("自动挡直接走！");
    }
}
