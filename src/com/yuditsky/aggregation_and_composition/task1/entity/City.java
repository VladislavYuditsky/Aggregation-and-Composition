package com.yuditsky.aggregation_and_composition.task1.entity;

public class City {
    private String name;
    private double square;

    public City(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public City(String name){
        this.name = name;
    }

    public City(double square){
        this();
        this.square = square;
    }

    public City(){
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
