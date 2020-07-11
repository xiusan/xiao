package com.alibaba.easyexcel.test.core.fill;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.converters.doubleconverter.DoubleStringConverter;

import lombok.Data;

/**
 * @author xiaojinlu
 */
@Data
public class FillData {
    private String name;
    @NumberFormat("#")
    @ExcelProperty(converter = DoubleStringConverter.class)
    private Double number;
    private String empty;
}
