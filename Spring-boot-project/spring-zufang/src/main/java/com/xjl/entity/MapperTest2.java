package com.xjl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/5/31 11:07
 * @Description:  ModelMapper 实体转换   实体
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MapperTest2 {

    private  Integer id;
    private  String name;
    private  String age;
    private  String email;



}
