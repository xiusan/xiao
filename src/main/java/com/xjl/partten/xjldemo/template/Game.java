package com.xjl.partten.xjldemo.template;

/**
 * Created by Administrator on 2019/11/19.
 */
public abstract class Game {
    abstract void inte();
    abstract void start();
    abstract void end();


    public void play() {
        inte();
        start();
        end();
    }
}
