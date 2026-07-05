package com.java.model;

import com.java.strategy.coupon.DiscountStrategy;

public class Coupon {

    private final String couponCode;
    private final String description;
    private final DiscountStrategy discountStrategy;

    public Coupon(String couponCode,
                  String description,
                  DiscountStrategy discountStrategy) {
        this.couponCode = couponCode;
        this.description = description;
        this.discountStrategy = discountStrategy;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getDescription() {
        return description;
    }

    public double calculateDiscount(double cartAmount) {
        return discountStrategy.calculateDiscount(cartAmount);
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponCode='" + couponCode + '\'' +
                ", description='" + description + '\'' +
                ", discountStrategy=" + discountStrategy +
                '}';
    }
}