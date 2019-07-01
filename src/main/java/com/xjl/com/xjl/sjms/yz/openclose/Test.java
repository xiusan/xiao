package com.xjl.com.xjl.sjms.yz.openclose;

/**
 * Created by Administrator on 2019/6/30.
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse("10","xjl",52d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        javaDiscountCourse.getPrice();
        javaDiscountCourse.getDiscountPrice();
    }
}
