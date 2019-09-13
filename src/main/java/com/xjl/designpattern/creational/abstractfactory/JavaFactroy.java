package com.xjl.designpattern.creational.abstractfactory;

/**
 * Created by Administrator on 2019/9/13.
 */
public class JavaFactroy implements CourseFactroy{

    @Override
    public Video getVideo() {

        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
