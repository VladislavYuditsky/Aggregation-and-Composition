package com.yuditsky.aggregation_and_composition.task4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agency {
    private List<Voucher> vouchers;

    public Agency(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "vouchers=" + vouchers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agency agency = (Agency) o;
        return vouchers.equals(agency.vouchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vouchers);
    }
}
