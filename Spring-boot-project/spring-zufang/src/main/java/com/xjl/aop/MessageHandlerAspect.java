package com.xjl.aop;

import com.xjl.assertutil.AssertUtil;
import com.xjl.exceptionhandler.XjlException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 顶层拦截(在SpringAOP事物之前),拦截所有异常,捕获,返回到WEB
 * @author xjl
 */
@Aspect
@Order(1)
@Component
public class MessageHandlerAspect {


    /** *
     * 拦截所有TMC方法,捕获指定异常
     * @author xjl
     * @param e
     * @date  2019/5/16 17:55
     * @return  void
     */
    @AfterThrowing(throwing = "e",pointcut = "execution(public * com.xjl..*.*(..))")
    public void throwsTmcAll(XjlException e){
        //转化为BS端可识别的异常
        AssertUtil.assertTrue(false,e.getStatusCode(),e.getMessage(),e.getParam());
    }



}
