package com.alibaba.easyexcel.test.core.head;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

/**
 * @author xiaojinlu
 */
@Data
public class NoHeadData {
    @ExcelProperty("字符串")
    private String string;
}
