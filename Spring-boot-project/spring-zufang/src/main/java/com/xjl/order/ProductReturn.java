package com.xjl.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/11 22:14
 * @Description:
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductReturn {

    private  String orderNum;
    private  String supplierId;
}
