package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.ArrayList;

public class District {
    private DistrictCenter districtCenter;
    private ArrayList<City> cities;
    private double square;

    public District(DistrictCenter districtCenter){
        this.districtCenter = districtCenter;
        cities = new ArrayList<>();
        cities.add(districtCenter);
    }

    public District(){
        districtCenter = new DistrictCenter(this);
        cities = new ArrayList<> ();
        cities.add(districtCenter);
    }

    public District(DistrictCenter districtCenter, ArrayList<City> cities, double square) {
        this.districtCenter = districtCenter;
        this.cities = cities;
        this.square = square;
    }

    public District(String name, double square){
        this();
        districtCenter.setName(name);
        this.square = square;
    }

    public District(String name){
        this();
        districtCenter.setName(name);
    }

    public DistrictCenter getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(DistrictCenter districtCenter) {
        this.districtCenter = districtCenter;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }


    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
