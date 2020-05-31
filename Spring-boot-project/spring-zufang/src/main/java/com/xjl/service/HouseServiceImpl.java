package com.xjl.service;

import com.google.common.collect.Maps;
import com.xjl.entity.MapperTest1;
import com.xjl.entity.MapperTest2;
import com.xjl.entity.MapperTest3;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by 瓦力.
 */
@Service
public class HouseServiceImpl implements IHouseService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void getTest() {
        HashMap<Object, Object> hashMap = Maps.newHashMap();
        MapperTest1 build1 = MapperTest1.builder()
                .id(1)
                .age("2")
                .name("3")
                .email("@")
                .build();
        MapperTest2 map = modelMapper.map(build1, MapperTest2.class);
        MapperTest3 map3 = modelMapper.map(build1, MapperTest3.class);
        System.out.println(com.alibaba.fastjson.JSONObject.toJSON(map3));
        System.out.println(com.alibaba.fastjson.JSONObject.toJSON(map));
    }
}
