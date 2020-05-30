package com.xjl.exceptionhandler;

 /**
  * 异常统一处理
  * @Author xiaojinlu
  * @Description
  * @Date 2020/5/24 21:13
  * @Param
  * @return
  **/
public class XjlException extends RuntimeException {

    /** 错误代码 */
    private int statusCode;

    /** 返回信息 */
    private String msg;

    /** 返回数据 */
    private Object data;

    private Object[] param;

    public XjlException(String message, int statusCode, String msg, Object data) {
        super(message);
        this.statusCode = statusCode;
        this.msg = msg;
        this.data = data;
    }

    public XjlException(int statusCode, String msg) {
        super(msg);
        this.statusCode = statusCode;
        this.msg = msg;
    }

    public XjlException(int statusCode) {
        this.statusCode = statusCode;
    }

    public XjlException(String msg) {
        super(msg);
        this.msg = msg;
    }
    public XjlException(int statusCode, Object[] param) {
        this.statusCode = statusCode;
        this.param = param;
    }

    public XjlException(int statusCode, String msg, Object[] param) {
        super(msg);
        this.statusCode = statusCode;
        this.param = param;
        this.msg = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object[] getParam() {
        return param;
    }

    public void setParam(Object[] param) {
        this.param = param;
    }
}

