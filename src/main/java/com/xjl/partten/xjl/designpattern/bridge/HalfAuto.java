package com.xjl.partten.xjl.designpattern.bridge;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/23 13:02
 * @Description:
 */

public class HalfAuto  implements Grade {
    @Override
    public void energy() {
        System.out.println("半自动挡！");
    }
}
