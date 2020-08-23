package com.xjl.partten.xjl.designpattern.bridge;

/**
 * 场景
 * 汽车可按品牌分（本例中只考虑BMT，BenZ，Land Rover），
 * 也可按手动档、自动档、手自一体来分。如果对于每一种车都实现一个具体类，
 *
 *
 * 已遵循的原则
 依赖倒置原则
 迪米特法则
 里氏替换原则
 接口隔离原则
 单一职责原则
 开闭原则
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/23 12:54
 * @Description:
 */

public class Test {


    public static void main(String[] args) {
        FatherCar fatherCar  = new BMT();
        fatherCar.setGrade(new Auto());
        fatherCar.move();
    }
}
