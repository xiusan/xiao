package com.xjl.partten.xjl.designpattern.state2;

/**
 * Created by Administrator on 2020/7/6.
 */
public class ConfirmedState extends State {
    @Override
    void ConfirmedState() {
        System.out.printf("已确认操作");
    }

    @Override
    void CompletedState() {
        super.getStateContext().getCompletedState();
    }

    @Override
    void CancelledState() {
        super.getStateContext().getCancelledState();
    }
}
