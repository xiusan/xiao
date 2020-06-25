package com.xjl.partten.xjldemo.visit;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/24 21:53
 * @Description:
 */

public class Php extends Language{
    @Override
    public void efficiency(Visiter visiter) {
        visiter.visit(this);
    }
}
