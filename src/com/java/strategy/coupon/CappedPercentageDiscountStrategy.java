package com.java.strategy.coupon;

public class CappedPercentageDiscountStrategy implements DiscountStrategy {

    private final double percentage;
    private final double maxDiscount;

    public CappedPercentageDiscountStrategy(double percentage,
                                            double maxDiscount) {
        this.percentage = percentage;
        this.maxDiscount = maxDiscount;
    }

    @Override
    public double calculateDiscount(double amount) {

        double discount = amount * percentage / 100;

        return Math.min(discount, maxDiscount);
    }
}
