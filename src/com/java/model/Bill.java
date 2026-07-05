package com.java.model;

import java.util.List;

import com.java.enums.TaxType;

import java.util.ArrayList;

public class Bill {

    private int cartAmount;
    private List<Coupon> coupons = new ArrayList<>();
    private List<TaxType> taxes = new ArrayList<>();

    public Bill(int cartAmount) {
        this.cartAmount = cartAmount;
    }

    public void addCoupon(Coupon coupon) {
        coupons.add(coupon);
    }

    public void addTax(TaxType taxType) {
        taxes.add(taxType);
    }

    public int getCartAmount() {
        return cartAmount;
    }

    public double calculateFinalBill() {

        double discount = 0;

        for (Coupon coupon : coupons) {
            discount += coupon.calculateDiscount(cartAmount);
        }

        discount = Math.min(discount, cartAmount);

        double amountAfterDiscount = cartAmount - discount;

        double tax = 0;

        for (TaxType taxType : taxes) {
            tax += amountAfterDiscount * taxType.getTaxPercentage() / 100;
        }

        return amountAfterDiscount + tax;
    }

    @Override
    public String toString() {
        double discount = 0;

        for (Coupon coupon : coupons) {
            discount += coupon.calculateDiscount(cartAmount);
        }

        discount = Math.min(discount, cartAmount);

        double amountAfterDiscount = cartAmount - discount;

        double tax = 0;
        for (TaxType taxType : taxes) {
            tax += amountAfterDiscount * taxType.getTaxPercentage() / 100;
        }

        return "Bill{" +
                "cartAmount=" + cartAmount +
                ", discount=" + discount +
                ", amountAfterDiscount=" + amountAfterDiscount +
                ", tax=" + tax +
                ", finalBillAmount=" + (amountAfterDiscount + tax) +
                ", coupons=" + coupons +
                ", taxes=" + taxes +
                '}';
    }
}
