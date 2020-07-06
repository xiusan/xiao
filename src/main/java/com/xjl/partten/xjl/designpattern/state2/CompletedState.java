package com.xjl.partten.xjl.designpattern.state2;

/**
 * Created by Administrator on 2020/7/6.
 */
public class CompletedState extends State {
    @Override
    void ConfirmedState() {
        super.getStateContext().getConfirmedState();
    }

    @Override
    void CompletedState() {
        System.out.printf("完成操作");
    }

    @Override
    void CancelledState() {
        super.getStateContext().getCancelledState();
    }
}
