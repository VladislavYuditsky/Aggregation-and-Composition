package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.ArrayList;
import java.util.Objects;

public class State {
    private Capital capital;
    private ArrayList<Region> regions;
    private String name;

    public State(Capital capital, ArrayList<Region> regions, String name) {
        this.capital = capital;
        this.regions = regions;
        this.name = name;
    }

    @Override
    public String toString() {
        return "State{" +
                "capital=" + capital +
                ", regions=" + regions +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return capital.equals(state.capital) &&
                regions.equals(state.regions) &&
                name.equals(state.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capital, regions, name);
    }

    public State() {
        capital = new Capital(this);
        regions = new ArrayList<>();
        regions.add(new Region(capital));
        name = "noname";
    }

    public State(Capital capital) {
        this.capital = capital;
        regions = new ArrayList<>();
        regions.add(new Region(capital));
        name = "noname";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }
}
