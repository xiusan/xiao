package com.xjl.com.xjl.sjms.yz.openclose;

/**
 * Created by Administrator on 2019/6/30.
 */
public class JavaCourse implements ICourse {
    private String id;
    private String name;
    private Double price;

    public JavaCourse(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
