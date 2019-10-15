package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.Objects;

public class RegionCenter extends DistrictCenter {
    private Region region;

    public RegionCenter(Region region) {
        this.region = region;
    }

    public RegionCenter() {
        region = new Region(this);
    }

    @Override
    public String toString() {
        return "RegionCenter{" +
                "region=" + region +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RegionCenter that = (RegionCenter) o;
        return region.equals(that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), region);
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
