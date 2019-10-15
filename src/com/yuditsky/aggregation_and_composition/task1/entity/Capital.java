package com.yuditsky.aggregation_and_composition.task1.entity;

public class Capital extends RegionCenter {
    private State state;

    public Capital() {
        state = new State(this);
    }

    public Capital(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
