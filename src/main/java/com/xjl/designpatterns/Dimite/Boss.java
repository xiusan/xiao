package com.xjl.designpatterns.Dimite;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/27 0027.
 * @Version 1.0
 */
public class Boss {
    protected  int getCourse(){
        TeamLeader teamLeader = new TeamLeader();
        return teamLeader.getCountCourse();
    }

}
