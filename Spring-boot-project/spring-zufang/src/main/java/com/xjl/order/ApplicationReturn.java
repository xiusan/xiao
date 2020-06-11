package com.xjl.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/11 22:14
 * @Description:
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationReturn {
    private String TrianName;
    private String TrianClassNum;
}
