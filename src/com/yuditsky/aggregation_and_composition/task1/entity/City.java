package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.Objects;

public class City {
    private String name;
    private double square;

    public City(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(city.square, square) == 0 &&
                name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square);
    }

    public City(double square) {
        this();
        this.square = square;
    }

    public City() {
        name = "noname";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
