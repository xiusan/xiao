package com.xjl;

import com.xjl.entity.MapperTest1;
import com.xjl.entity.MapperTest2;
import org.modelmapper.ModelMapper;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/5/31 10:46
 * @Description:
 */
public class MapperTest {

/*
    @Autowired
    private ModelMapper modelMapper;
*/

 /**
  *
  * @Author xiaojinlu
  * @Description
  * @Date 2020/5/31 11:13
  * @Param
  * @return
  **/
 public static void main(String[] args) {
     test();
 }
    public static void test() {
        ModelMapper modelMapper = new ModelMapper();
        MapperTest1 build1 = MapperTest1.builder()
             .id(1)
             .age("2")
             .name("3")
             .email("@")
             .build();
     MapperTest2 map = modelMapper.map(build1, MapperTest2.class);
     System.out.println(com.alibaba.fastjson.JSONObject.toJSON(map));
 }


}
