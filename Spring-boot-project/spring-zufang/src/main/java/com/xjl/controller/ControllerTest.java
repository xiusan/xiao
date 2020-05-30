package com.xjl.controller;

import com.xjl.base.ApiResponse;
import com.xjl.base.BaseController;
import com.xjl.base.SysConfigMsg;
import com.xjl.entity.House;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/5/24 18:02
 * @Description:
 */
@Controller
public class ControllerTest extends BaseController {
    /**
     * 统一格式处理
     * @return
     */
    @RequestMapping("get")
    @ResponseBody
    public ApiResponse get(){
        House house = House.builder().area(2).cityEnName("ddd").build();
        String houses =super.toJsonString(house);
        //JSONObject.toJSON(house);测试两者转换一样
        return  ApiResponse.ofSuccessSon("ok");
    }
    /**
     * 统一格式处理
     * @return
     */
    @RequestMapping("get1")
    @ResponseBody
    public ApiResponse get1(){
        House house = House.builder().area(2).cityEnName("ddd").build();
        String houses =super.toJsonString(house);
        //JSONObject.toJSON(house);测试两者转换一样
        return ApiResponse.ofSuccess(houses);
    }
 /**
  * aop 异常拦截
  * @Author xiaojinlu
  * @Description
  * @Date 2020/5/24 21:35
  * @Param
  * @return
  **/
    @RequestMapping("exceptionTest")
    @ResponseBody
    public ApiResponse exceptionTest(){
        List<Object> objects = Arrays.asList("sss","sss");
        ClassCastException exception = new ClassCastException();
        exception.printStackTrace();
        objects.get(30);

        //AssertUtil.assertNotIsEmpty(null,"我是不可知");
        return ApiResponse.ofSuccess("");
    }

    /**
  * aop 配置预加载
  * @Author xiaojinlu
  * @Description
  * @Date 2020/5/24 21:35
  * @Param
  * @return
  **/
    @RequestMapping("proJump")
    @ResponseBody
    public ApiResponse proJump(){
        return ApiResponse.ofSuccess( SysConfigMsg.sysConfig.getProperty("test"));
    }
}
