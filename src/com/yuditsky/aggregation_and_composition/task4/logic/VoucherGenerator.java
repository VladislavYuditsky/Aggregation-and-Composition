package com.yuditsky.aggregation_and_composition.task4.logic;

import com.yuditsky.aggregation_and_composition.task4.entity.Voucher;

import java.util.Random;

public class VoucherGenerator {

    public static Voucher generate(){
        Voucher voucher = new Voucher();
        Random random = new Random();

        voucher.setDays(random.nextInt(150) + 3);
        voucher.setTransport(Voucher.Transport.values()[random.nextInt(3)]);
        voucher.setType(Voucher.Type.values()[random.nextInt(4)]);
        voucher.setFeed(Voucher.Feed.values()[random.nextInt(5)]);

        return voucher;
    }
}