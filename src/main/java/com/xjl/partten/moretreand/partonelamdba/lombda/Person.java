package com.xjl.partten.moretreand.partonelamdba.lombda;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/3/16 16:05
 * @Description:
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;
    private String name;
    private String address;


}