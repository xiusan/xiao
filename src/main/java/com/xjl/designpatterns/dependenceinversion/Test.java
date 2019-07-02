package com.xjl.designpatterns.dependenceinversion;

/**
 * 依赖倒置原则（IOD）
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/26 0026.
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Xjinlu xjinlu =new Xjinlu();
        xjinlu.setiCouse(new JavaCouse());
        xjinlu.studyInternatCouse();
        xjinlu.setiCouse(new PythonCouse());
        xjinlu.studyInternatCouse();
        xjinlu.setiCouse(new FFCouse());
        xjinlu.studyInternatCouse();
    }
}
