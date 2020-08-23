package com.xjl.partten.xjl.designpattern.bridge;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/23 13:07
 * @Description:
 */

public  abstract class FatherCar{
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public abstract void move();
}
