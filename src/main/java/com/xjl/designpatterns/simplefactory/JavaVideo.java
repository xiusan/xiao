package com.xjl.designpatterns.simplefactory;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/28 0028.
 * @Version 1.0
 */
public class JavaVideo implements Video {
    @Override
    public void getVodeo() {
        System.out.println("生产java");
    }
}
