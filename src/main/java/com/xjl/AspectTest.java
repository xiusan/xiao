package com.xjl;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/3/29 16:37
 * @Description:
 */
@Aspect
@Component
public class AspectTest {

    private static  final Logger log  = LoggerFactory.getLogger(AspectTest.class);
     /**
      *@Pointcut("execution(* com.xjl.controller.Shoping.*(..))")
      *
      *
      * @Author xiaojinlu
      * @Description
      * @Date 2020/3/29 17:49
      * @Param
      * @return
      **/
    @Pointcut("within(com.xjl.controller..*)")
    public void webLog() { }
 /*   @Before("webLog()")
    public void doBefore() {
        log.info("11111111111");
    }

    @AfterReturning("webLog()")
    public void afterReturning() {
        log.info("222222222222222");
    }

    @AfterThrowing("webLog()")
    public void afterThrowing() {
        log.info("33333333");
    }

    @After("webLog()")
    public void after() {
        log.info("444444444");
    }*/

    @Around("webLog()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String uri = request.getRequestURI().replace(request.getContextPath(), "");
        Object result = joinPoint.proceed();
        //if (uri.indexOf(BaseUriHead.API) != -1 || uri.indexOf(BaseUriHead.APPLETS) != -1) {
            String inPutParam = preHandle(joinPoint, request);
            String outPutParam = postHandle(result);
            String ip = getRemoteHost(request);
            log.info("remoteIP:{},uri:{},inPutParam:{},outPutParam:{}", ip, uri, inPutParam, outPutParam);
       // }
    }

    private String preHandle(ProceedingJoinPoint joinPoint, HttpServletRequest request) {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();
        Annotation[] annotations = targetMethod.getAnnotations();
        StringBuffer sb = new StringBuffer();
        String token = request.getHeader("token");
        if (StringUtils.isNotBlank(token)) {
            sb.append("heander-token:" + token + ",");
        }
        for (Annotation annotation : annotations) {
            log.info("1-{}", annotation.annotationType().toString());
            if (annotation.annotationType().toString().indexOf("org.springframework.web.bind.annotation") == -1) {
                continue;
            }
            StringBuffer append = sb.append(JSONObject.toJSONString(request.getParameterMap()));
        }
        return sb.toString();
    }

    /**
     * 返回数据
     *
     * @param retVal
     * @return
     */
    private String postHandle(Object retVal) {
        if (null == retVal) {
            return "";
        }
        return JSONObject.toJSONString(retVal);
    }

    private String getRemoteHost(HttpServletRequest request) {
        String unknown = "unknown";
        String ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ip) || unknown.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ip) || unknown.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ip) || unknown.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : ip;
    }



}
