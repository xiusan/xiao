package com.xjl.partten.xjl.designpattern.state2;

/**
 * 状态模式
 * 可以无感知调用对应状态
 * 1 已确认  1 confirmedState
 * 2 已完成 2 completedState
 * 3 已取消 3 cancelledState
 *
 * Created by Administrator on 2020/7/6.
 */
public class Test {

    public static void main(String[] args) {

        StateContext stateContext = new StateContext();
        State state =new ConfirmedState();
        stateContext.setState(state);
        state.CompletedState();
        state.CancelledState();
    }
}
