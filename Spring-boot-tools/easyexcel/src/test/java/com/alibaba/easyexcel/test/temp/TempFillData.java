package com.alibaba.easyexcel.test.temp;

import com.alibaba.excel.annotation.write.style.ContentRowHeight;

import lombok.Data;

/**
 * @author xiaojinlu
 */
@Data
@ContentRowHeight(30)
public class TempFillData {
    private String name;
    private double number;
}
