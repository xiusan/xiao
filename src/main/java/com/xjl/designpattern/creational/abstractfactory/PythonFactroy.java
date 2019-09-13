package com.xjl.designpattern.creational.abstractfactory;

/**
 * Created by Administrator on 2019/9/13.
 */
public class PythonFactroy implements CourseFactroy{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return  new PythonArticle();
    }
}
