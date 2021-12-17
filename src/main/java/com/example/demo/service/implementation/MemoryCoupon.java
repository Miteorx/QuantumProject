package com.example.demo.service.implementation;

import com.example.demo.models.Coupon;
import com.example.demo.service.api.CouponService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemoryCoupon implements CouponService {
    private List<Coupon> couponList = new ArrayList<>(Arrays.asList(
            new Coupon(100),
            new Coupon(150),
            new Coupon(200))
    );

    @Override
    public List<Coupon> search() {
        return couponList;
    }

    @Override
    public void save(Coupon oneCoupon) {
        for (Coupon coupon : couponList) {
            if(oneCoupon.getCouponId() == coupon.getCouponId()) {
                couponList.set(couponList.indexOf(coupon), oneCoupon);
            }
        }
    }
}
