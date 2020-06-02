package com.xjl.exceptionhandler;


import com.google.common.collect.Maps;
import com.xjl.base.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 @ControllerAdvice  全局异常处理
             全局数据绑定 
             全局数据预处理
 全局参数校验
 * 
 * 异常捕捉
 */
@ControllerAdvice
public class ApiExceptionHandler {

    Logger logger = LoggerFactory.getLogger(ApiExceptionHandler.class);

    @Autowired
    MessageSource messageSource;

    /**
     * api异常
     *
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = ApiException.class)
    @ResponseBody
    public ApiResponse handlerApiException(HttpServletRequest request, Exception e) {
        ApiException apiException = (ApiException) e;
        logger.error("apiError:", e);

        String message = messageSource
                .getMessage(String.format(ApiResultCode.RESP_CODE_KEY, apiException.getErrorCode()), null, null);
        return new ApiResponse(apiException.getErrorCode(), message);

    }

    /**
     * api异常
     *
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = XjlException.class)
    @ResponseBody
    public ApiResponse handlerBsException(HttpServletRequest request, Exception e) {
        XjlException violationException = (XjlException) e;
        logger.error("apiError:", e);
        String message = violationException.getMsg();
        int statusCode = violationException.getStatusCode();
        if (Objects.isNull(message)) {
            try {
                message = messageSource.getMessage(String.format(ApiResultCode.RESP_CODE_KEY, violationException.getStatusCode()),
                        violationException.getParam(), null);
            } catch (Exception error) {
                message = messageSource.getMessage(String.format(ApiResultCode.RESP_CODE_KEY, 500),
                        new Object[]{violationException.getStatusCode()}, null);
            }
        }
        return new ApiResponse(statusCode, message);
    }

    /**
     * 系统未知异常
     *
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception e) throws Exception {
        if (e.getCause() instanceof ApiException) {
            return handlerApiException(request, (ApiException) e);
        } else if (e.getCause() instanceof XjlException) {
            return this.handlerBsException(request, e);
        }else if(e instanceof BindException) {
            BindException ex = (BindException)e;
            List<ObjectError> errors = ex.getAllErrors();
            ObjectError error = errors.get(0);
            String msg = error.getDefaultMessage();
            return ApiResponse.ofSuccessSon(msg);
        }else {
            logger.error("sysError:", e);
            String message = messageSource
                    .getMessage(String.format(ApiResultCode.RESP_CODE_KEY, ApiResultCode.SYSTEM_ERROR), null, null);
            return new ApiResponse(ApiResultCode.SYSTEM_ERROR, message);
        }

    }
    
     /**
      * 全局数据绑定
      * @Author xiaojinlu
      * @Description 
      * @Date 2020/5/31 22:44
      * @Param 
      * @return 
      **/
     @ModelAttribute(name = "mdgggg")
     public Map<String,Object> mydata() {
         HashMap<String, Object> map = Maps.newHashMap();
         map.put("age", 99);
         map.put("gender", "男");
         return map;
     }

      /**
       *
       * @Author xiaojinlu
       * @Description
       * @Date 2020/5/31 22:45
       * @Param
       * @return
       **/
      @InitBinder("b")
      public void b(WebDataBinder binder) {
          binder.setFieldDefaultPrefix("b.");
      }
    @InitBinder("a")
    public void a(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
}
