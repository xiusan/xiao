package com.xjl.exceptionhandler;

/**
 * api 异常类
 *
 * @author xjl
 * @date
 */
public class ApiException extends RuntimeException {

    private int errorCode;
    private String msg;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ApiException(int errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public ApiException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ApiException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ApiException(int errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "ApiException [errorCode=" + errorCode + "]";
    }
}
