package com.xjl.partten.xjl.designpattern.Observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 订阅者
 * 保存订阅对象 为发布通知用 @List
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/6/13 22:57
 * @Description:
 */

public class Subject {

    private List<Observer> observers = Lists.newArrayList();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        int state= this.state;
        for (Observer observer : observers) {
            observer.updata(state);
        }
    }


}
