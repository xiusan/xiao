package com.xjl.partten.xjldemo.flyweight;

import java.util.HashMap;

/**
 * Created by xiaojinlu1990@163.partten on 2019/11/27.
 */
public class FactoryFly {

    private HashMap hashMap = new HashMap();


    public  Shape getShape(String color){
        if(hashMap.get(color) == null){
            Shape shape = new Circle(color);
            hashMap.put(color,shape);
            System.out.println("-----------------"+color);
        }
        return (Shape) hashMap.get(color);

    }

}
