package com.xjl.com.xjl.sjms.yz.daozhi;

/**
 * Created by Administrator on 2019/6/30.
 */
public class Xjl {
   private ICourse iCourse;

    public void setiCourse(Class c) {
        try {
            iCourse = (ICourse) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void learnCourse() {
        iCourse.StudyICourse();
    }
}
