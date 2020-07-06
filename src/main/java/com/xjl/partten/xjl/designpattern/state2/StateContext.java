package com.xjl.partten.xjl.designpattern.state2;

/**
 * Created by Administrator on 2020/7/6.
 */
public class StateContext {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        state.setStateContext(this);
    }


    private final static CancelledState cancelledState = new CancelledState();
    private final static CompletedState completedState = new CompletedState();
    private final static ConfirmedState confirmedState = new ConfirmedState();

    public   void getCancelledState() {
        cancelledState.CancelledState();
    }

    public   void getCompletedState() {
        completedState.CompletedState();
    }

    public   void getConfirmedState() {
        confirmedState.ConfirmedState();
    }
}
