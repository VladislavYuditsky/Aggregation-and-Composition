package com.yuditsky.aggregation_and_composition.task1.entity;

public class DistrictCenter extends City {
    private District district;

    public DistrictCenter() {
        district = new District(this);
    }

    public DistrictCenter(District district){
        this.district = district;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
