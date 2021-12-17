package com.example.demo.controllers;

import com.example.demo.models.Coupon;
import com.example.demo.service.implementation.MemoryCoupon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Random;

@Controller
public class CouponController {
    private final MemoryCoupon memoryCoupon;

    public CouponController(MemoryCoupon memoryCoupon) {
        this.memoryCoupon = memoryCoupon;
    }

    @GetMapping("/coupon")
    public String coupon() {
        return "coupon";
    }

    @PostMapping("/coupon")
    public String postCoupon(Coupon coupon, Model model) {
        List<Coupon> coupons = memoryCoupon.search();
        for (Coupon oneCoupon : coupons) {
            if (oneCoupon.getCouponId() == coupon.getCouponId()) {
                Random r = new Random();
                double price = 0;
                switch (r.nextInt(3)) {
                    case 1:
                        price = coupon.getPrice() / 100 * 90;
                        break;
                    case 2:
                        price = coupon.getPrice() / 100 * 50;
                        break;
                    case 3:
                        price = coupon.getPrice() / 100 * 10;
                        break;
                }
                oneCoupon.setPrice(price);
                memoryCoupon.save(oneCoupon);
                model.addAttribute("message", "New price is : " + price);

                return "coupon";
            }
        }
        model.addAttribute("message", "Coupon is not exists!");
        return "coupon";
    }

}
