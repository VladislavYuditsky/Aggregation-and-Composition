package com.yuditsky.aggregation_and_composition.task1.entity;

public class RegionCenter extends DistrictCenter {
    private Region region;

    public RegionCenter(Region region) {
        this.region = region;
    }

    public RegionCenter(){
        region = new Region(this);
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
