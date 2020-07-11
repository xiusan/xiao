package com.alibaba.easyexcel.test.core.simple;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

/**
 * @author xiaojinlu
 */
@Data
public class SimpleData {
    @ExcelProperty("姓名")
    private String name;
}
