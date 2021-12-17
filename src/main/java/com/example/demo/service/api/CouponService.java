package com.example.demo.service.api;

import com.example.demo.models.Coupon;

import java.util.List;

public interface CouponService {
    List<Coupon> search();

    void save(Coupon oneCoupon);
}
