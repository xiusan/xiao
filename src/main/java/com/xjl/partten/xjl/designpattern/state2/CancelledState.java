package com.xjl.partten.xjl.designpattern.state2;

/**
 * Created by Administrator on 2020/7/6.
 */
public class CancelledState extends State {
    @Override
    void ConfirmedState() {
        super.getStateContext().getConfirmedState();
    }

    @Override
    void CompletedState() {
        super.getStateContext().getCompletedState();
    }

    @Override
    void CancelledState() {
        System.out.printf("已取消操作");
    }
}
