package com.example.demo.models;

public class Coupon {
    private int couponId;
    private double price;

    public Coupon() {
    }

    public Coupon(int couponId) {
        this.couponId = couponId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
