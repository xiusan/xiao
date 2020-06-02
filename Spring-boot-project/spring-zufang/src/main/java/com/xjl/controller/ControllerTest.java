package com.xjl.controller;

import com.xjl.base.ApiResponse;
import com.xjl.base.BaseController;
import com.xjl.base.SysConfigMsg;
import com.xjl.entity.Author;
import com.xjl.entity.Book;
import com.xjl.entity.House;
import com.xjl.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/5/24 18:02
 * @Description:
 */
@Controller
public class ControllerTest extends BaseController {
    @Autowired
    private IHouseService iHouseService;
    /**
     * 统一格式处理
     *  参数校验
     * @return
     */
    @RequestMapping("get")
    @ResponseBody
    public ApiResponse get( @Valid  Book book){
        House house = House.builder().area(2).cityEnName("ddd").build();
        String houses =super.toJsonString(house);
        //JSONObject.toJSON(house);测试两者转换一样
        return  ApiResponse.ofSuccessSon("ok");
    }

    /**
     * 测试实体转换
     * @return
     */
    @RequestMapping("change")
    @ResponseBody
    public ApiResponse change(){
         iHouseService.getTest();
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


    /**
     * 全局数据绑定
     * @Author xiaojinlu
     * @Description
     * @Date 2020/5/24 21:35
     * @Param
     * @return
     **/
    @GetMapping("/hello")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        System.out.println(map);
        int i = 1 / 0;
        return "hello controller advice";
    }
    /**
     * 全局数据预处理
     * @Author xiaojinlu
     * @Description
     * @Date 2020/5/24 21:35
     * @Param
     * @return
     **/

    @PostMapping("/book")
    public void addBook(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        System.out.println(book);
        System.out.println(author);
    }
}
