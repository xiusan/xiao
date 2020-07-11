package com.alibaba.easyexcel.test.core.repetition;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

/**
 * @author xiaojinlu
 */
@Data
public class RepetitionData {
    @ExcelProperty("字符串")
    private String string;
}
