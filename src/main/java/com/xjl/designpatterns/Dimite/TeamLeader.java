package com.xjl.designpatterns.Dimite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/27 0027.
 * @Version 1.0
 */
public class TeamLeader {
    public int getCountCourse() {
        List<Course> list = new ArrayList<Course>();
        for (int i = 0; i < 5; i++) {
            list.add(new Course());
        }
        return list.size();
    }
}
