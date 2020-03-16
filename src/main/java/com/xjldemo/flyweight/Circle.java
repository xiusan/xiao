package com.xjldemo.flyweight;

import java.util.HashMap;

/**
 * Created by xiaojinlu1990@163.com on 2019/11/27.
 */
public class Circle  implements  Shape{
    private int x;
    private int y;
    private String Color;

    public void setColor(String color) {
        Color = color;
    }

    public Circle(String color) {
        Color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(Color);
    }
}
