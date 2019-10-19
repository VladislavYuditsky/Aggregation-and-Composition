package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    private City regionCenter;
    private ArrayList<District> districts;
    private double square;

    public Region() {
        regionCenter = new City();
        districts = new ArrayList<>();
        districts.add(new District());
    }

    public Region(City regionCenter) {
        this.regionCenter = regionCenter;
        districts = new ArrayList<>();
        districts.add(new District());
    }

    public Region(City regionCenter, ArrayList<District> districts) {
        this.regionCenter = regionCenter;
        this.districts = districts;
    }

    public Region(String name) {
        this();
        regionCenter.setName(name);
    }

    public Region(String name, double square) {
        this(name);
        this.square = square;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionCenter=" + regionCenter +
                ", districts=" + districts +
                ", square=" + square +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 &&
                regionCenter.equals(region.regionCenter) &&
                districts.equals(region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCenter, districts, square);
    }
}
