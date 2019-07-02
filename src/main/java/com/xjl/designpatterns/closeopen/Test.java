package com.xjl.designpatterns.closeopen;

/**
 * 单一原则
 *
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/26 0026.
 * @Version 1.0
 * 应用场景  不修改原来的代码，容易引起不可控的问题，采用继承的方式修改原来的方法
 */
public class Test {
/*    public static void main(String[] args) {
        ICouse iCouse = new JavaCouse("1","java",56d);
        System.out.println("id:"+iCouse.getId()+"，name:"+iCouse.getName()+"，价格:"+iCouse.getPrice());
    }   */

    public static void main(String[] args) {
        ICouse iCouse = new JavaDisCountCouse("1","java",56d);
        JavaDisCountCouse javaDisCountCouse = (JavaDisCountCouse) iCouse;
        System.out.println("id:"+javaDisCountCouse.getId()+"，name:"+javaDisCountCouse.getName()+"，原价价格:"+javaDisCountCouse.getPratten()+",折扣价:"+javaDisCountCouse.getDisCountPrice());

    }
}
