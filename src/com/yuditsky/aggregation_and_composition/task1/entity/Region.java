package com.yuditsky.aggregation_and_composition.task1.entity;

import com.yuditsky.aggregation_and_composition.task1.logic.CalculateSquare;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    private RegionCenter regionCenter;
    private ArrayList<District> districts;
    private double square;

    public Region() {
        regionCenter = new RegionCenter(this);
        districts = new ArrayList<>();
        districts.add(new District());
        square = CalculateSquare.calculate(this);
    }

    public Region(RegionCenter regionCenter) {
        this.regionCenter = regionCenter;
        districts = new ArrayList<>();
        districts.add(new District());
        square = CalculateSquare.calculate(this);
    }

    public Region(RegionCenter regionCenter, ArrayList<District> districts) {
        this.regionCenter = regionCenter;
        this.districts = districts;
        square = CalculateSquare.calculate(this);
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

    public RegionCenter getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(RegionCenter regionCenter) {
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
}
