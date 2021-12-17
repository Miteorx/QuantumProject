//package com.example.demo;
//
//import com.example.demo.models.Coupon;
//import com.example.demo.service.implementation.MemoryCoupon;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
//
//public class RepoTest {
//    @Autowired
//    private MemoryCoupon memoryCoupon;
//
//    @Test
//    public void save() throws Exception {
//        List<Coupon> coupons = memoryCoupon.search();
//        for (Coupon oneCoupon : coupons) {
//            if (oneCoupon.getCouponId() == 200) {
//                oneCoupon.setPrice(100);
//                memoryCoupon.save(oneCoupon);
//            }
//            assertThat
//        }
//    }
//}
