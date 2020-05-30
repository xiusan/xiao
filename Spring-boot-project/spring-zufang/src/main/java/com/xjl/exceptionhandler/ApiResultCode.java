package com.xjl.exceptionhandler;

/**
 * api响应码
 *
 * @author xjl
 * @date 2019/4/22 15:56
 */
public final class ApiResultCode {

    public static final String RESP_CODE_KEY = "respcode.%s";
    /**
     * 操作成功
     */
    public static final int SUCCESS = 200;

    /**
     * 操作失败
     */
    public static final int FAIL = -1;
    /**
     * 数据不存在
     */
    public static final int NO_DATA = -2;

    /**
     * 非法参数
     */
    public static final int ILLEGAL_PARAM = -3;
    /**
     * xss校验失败
     */
    public static final int XSS_ERROR = 400;
    /**
     * 系统异常
     */
    public static final int SYSTEM_ERROR = 503;
    /**
     * 用户未登录
     */
    public static final int NO_AUTH = -200;

    /**
     * 请求地址找不到服务
     */
    public static final int NOT_FOUND = 404;

    /**
     * 登录超时
     */
    public static final int LOGIN_EXPIRE = 90001;
    /**
     * 重复提交
     */
    public static final int RESUBMIT_REQUEST = 90002;
}
