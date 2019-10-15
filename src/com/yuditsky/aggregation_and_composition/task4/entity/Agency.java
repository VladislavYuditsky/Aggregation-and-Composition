package com.yuditsky.aggregation_and_composition.task4.entity;

import java.util.ArrayList;

public class Agency {
    private ArrayList<Voucher> vouchers;

    public Agency(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }
}
