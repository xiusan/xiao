package com.alibaba.excel.exception;

/**
 *
 * @author xiaojinlu
 */
public class ExcelCommonException extends RuntimeException {

    public ExcelCommonException() {}

    public ExcelCommonException(String message) {
        super(message);
    }

    public ExcelCommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcelCommonException(Throwable cause) {
        super(cause);
    }
}
