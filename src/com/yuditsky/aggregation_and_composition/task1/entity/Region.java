package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.ArrayList;

public class Region {
    private RegionCenter regionCenter;
    private ArrayList<District> districts;
    private double square;

    private void calculateSquare() {
        for (District district : districts) {
            for (City city : district.getCities()) {
                square += city.getSquare();
            }
            square += district.getSquare();
        }
    }

    public Region() {
        regionCenter = new RegionCenter(this);
        districts = new ArrayList<>();
        districts.add(new District());
        calculateSquare();
    }

    public Region(RegionCenter regionCenter) {
        this.regionCenter = regionCenter;
        districts = new ArrayList<>();
        districts.add(new District());
        calculateSquare();
    }

    public Region(RegionCenter regionCenter, ArrayList<District> districts) {
        this.regionCenter = regionCenter;
        this.districts = districts;
        calculateSquare();
    }

    public RegionCenter getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(RegionCenter regionCenter) {
        this.regionCenter = regionCenter;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    public double getSquare() {
        return square;
    }
}
