package com.yuditsky.aggregation_and_composition.task1.entity;

import java.util.Objects;

public class DistrictCenter extends City {
    private District district;

    public DistrictCenter() {
        district = new District(this);
    }

    public DistrictCenter(District district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "DistrictCenter{" +
                "district=" + district +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DistrictCenter that = (DistrictCenter) o;
        return district.equals(that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), district);
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
