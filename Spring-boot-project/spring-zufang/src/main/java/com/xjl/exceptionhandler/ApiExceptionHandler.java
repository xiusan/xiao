package com.xjl.exceptionhandler;


import com.xjl.base.ApiResponse;
import com.xjl.exception.XjlException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;


/**
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
        }
        logger.error("sysError:", e);
        String message = messageSource
                .getMessage(String.format(ApiResultCode.RESP_CODE_KEY, ApiResultCode.SYSTEM_ERROR), null, null);
        return new ApiResponse(ApiResultCode.SYSTEM_ERROR, message);
    }

}
