package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Capital{" +
                "state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Capital capital = (Capital) o;
        return state.equals(capital.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }
}
