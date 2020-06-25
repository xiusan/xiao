package com.xjl.partten.xjl.designpattern.Observer;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/13 23:01
 * @Description:
 */

public abstract class  Observer  {
    protected Subject subject;
    abstract void updata(int state);

}
