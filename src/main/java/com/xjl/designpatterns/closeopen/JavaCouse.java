package com.xjl.designpatterns.closeopen;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/26 0026.
 * @Version 1.0
 */
public class JavaCouse  implements  ICouse{
    private  String id;
    private  String name;
    private  Double price;

    public JavaCouse(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getId() {
        return this.id;

    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
