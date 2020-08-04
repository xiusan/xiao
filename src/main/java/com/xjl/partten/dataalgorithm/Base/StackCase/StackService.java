package com.xjl.partten.dataalgorithm.Base.StackCase;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/2 17:04
 * @Description:
 */

public interface StackService<Item> {

    //入栈
    StackService<Item> push(Item item);

    //出栈
    Item pop();

    //大小
    int size();
    //是否为空
    boolean isEmpty();

}
