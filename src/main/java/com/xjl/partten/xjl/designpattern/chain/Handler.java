package com.xjl.partten.xjl.designpattern.chain;

/**
 * Created by Administrator on 2020/7/6.
 */
public abstract class Handler {
    protected Handler handler;

    public void setggHandler(Handler handler) {
        this.handler = handler;
    }

    abstract void doPoly(PiZhun piZhun);
}
