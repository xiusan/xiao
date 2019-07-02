package com.xjl.designpatterns.Dimite;

/**
 * 迪米特原则
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/27 0027.
 * @Version 1.0
 * 只和朋友说话
 * 不喝陌生人说话
 * 场景
 * Boss 通过 TeamLeader 查询 Course
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println(boss.getCourse());
    }
}
