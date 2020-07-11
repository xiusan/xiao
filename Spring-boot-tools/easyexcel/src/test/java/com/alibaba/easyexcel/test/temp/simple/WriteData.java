package com.alibaba.easyexcel.test.temp.simple;

import com.alibaba.excel.annotation.write.style.ContentStyle;

import lombok.Data;

/**
 * write data
 *
 * @author xiaojinlu
 **/
@Data
public class WriteData {
    @ContentStyle(locked = true)
    private float f;
}
