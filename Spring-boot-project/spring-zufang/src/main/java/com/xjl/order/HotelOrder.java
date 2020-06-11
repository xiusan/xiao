package com.xjl.order;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 *
 * 订单提交模板
 *
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/11 22:06
 * @Description:
 */

public abstract class HotelOrder {
    private ApplicationReturn applicationReturn;
    private ProductReturn productReturn;

    public ApplicationReturn getApplicationReturn() {
        return applicationReturn;
    }

    public void setApplicationReturn(ApplicationReturn applicationReturn) {
        this.applicationReturn = applicationReturn;
    }

    public ProductReturn getProductReturn() {
        return productReturn;
    }

    public void setProductReturn(ProductReturn productReturn) {
        this.productReturn = productReturn;
    }

    //检验申请单
    abstract void chackApplication(OrderParameter orderParameter);
    //检验入住人
    abstract void checkInPerson(OrderParameter orderParameter);
    //检验控制点信息
    abstract void chackControllerMessage(OrderParameter orderParameter);
    //入库信息
    abstract void insertMysql(OrderParameter orderParameter);


    public Map bookOrder(OrderParameter orderParameter) {
        //检验申请单
        chackApplication(orderParameter);
        //检验入住人
        checkInPerson(orderParameter);
        //检验控制点信息
        chackControllerMessage(orderParameter);
        //入库信息
        insertMysql(orderParameter);
        return Maps.newConcurrentMap();
    }


}
