package com.xjl.partten.xjl.designpattern.bridge;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/23 13:03
 * @Description:
 */

public class DandMove  implements Grade {
    @Override
    public void energy() {
        System.out.println("哎 手动挡");
    }
}
