package com.xjl.partten.xjl.designpattern.state2;

/**
 * Created by Administrator on 2020/7/6.
 */
public abstract class State {

    private  StateContext stateContext;

    public StateContext getStateContext() {
        return stateContext;
    }

    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    abstract void ConfirmedState();
    abstract void CompletedState();
    abstract void CancelledState();




}
