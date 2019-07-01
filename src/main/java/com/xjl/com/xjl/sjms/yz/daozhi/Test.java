package com.xjl.com.xjl.sjms.yz.daozhi;

/**
 * Created by Administrator on 2019/6/30.
 * 依赖倒置原则
 * 场景：xjl要学习很多课程
 */
public class Test {
//vi  依赖实现编程
    //    public static void main(String[] args) {
//        Xjl xjl = new Xjl();
//        xjl.getJavaCourse();
//        xjl.getJsCourse();
//        xjl.getPathonCourse();
//    }

    //v2  面向接口编程 方法传参
//    public static void main(String[] args) {
//        Xjl xjl = new Xjl();
//        xjl.learnCourse(new JavaCourse());
//        xjl.learnCourse(new JsCourse());
//    }


//v3  构造方法传参
//    public static void main(String[] args) {
//        Xjl xjl = new Xjl(new JavaCourse());
//        xjl.learnCourse();
//    }


//v4  属性传参
//    public static void main(String[] args) {
//        Xjl xjl = new Xjl();
//        xjl.setiCourse(new JavaCourse());
//        xjl.learnCourse();
//        xjl.setiCourse(new JsCourse());
//        xjl.learnCourse();
//    }


//v5 反射构造
    public static void main(String[] args) {
        Xjl xjl = new Xjl();
        xjl.setiCourse(JavaCourse.class);
        xjl.learnCourse();
    }

}
