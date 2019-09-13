package com.xjl.designpattern.creational.simplefactory;

/**
 * 简单工厂模式（由工厂对象决定创建那个实例）
 * 优点：
 *      应用层无需关心创建细节，需要那个就创建那个
 * 缺点：
 *      职责过重增加会修改改原有类，不符合单一原则，用反射可以解决这个问题
 * 应用场景：
 *      工厂负责创建的比较少
 *
 */
public class Test {
    public static void main(String[] args) {
        videoFactory factory = new videoFactory();
        factory.getVideo(javaVideo.class);
    }

}
