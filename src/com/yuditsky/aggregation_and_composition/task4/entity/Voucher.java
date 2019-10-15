package com.yuditsky.aggregation_and_composition.task4.entity;

import java.util.Objects;

public class Voucher {
    private Type type;
    private int days;
    private Transport transport;
    private Feed feed;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "type=" + type +
                ", days=" + days +
                ", transport=" + transport +
                ", feed=" + feed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return days == voucher.days &&
                type == voucher.type &&
                transport == voucher.transport &&
                feed == voucher.feed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, days, transport, feed);
    }

    public enum Type {
        REST,
        EXCURSION,
        TREATMENT,
        SHOPPING,
        CRUISE;
    }

    public enum Transport {
        AIRPLANE,
        SHIP,
        TRAIN,
        BUS;
    }

    public enum Feed {
        RO,
        BB,
        HB,
        FB,
        AI,
        UAI;
    }

    public Voucher() {
    }

    public Voucher(Type type, int days, Transport transport, Feed feed) {
        this.type = type;
        this.days = days;
        this.transport = transport;
        this.feed = feed;
    }
}
