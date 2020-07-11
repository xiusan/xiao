package com.xjl.partten.xjl.designpattern.templatepattern;

import lombok.*;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 14:32
 * @Description:
 */


public class Order {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
