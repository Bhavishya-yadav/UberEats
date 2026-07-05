package com.java;

public class UpiPaymentConfig extends PaymentConfig{
    private String upiId;

    public UpiPaymentConfig(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return this.upiId;
    }
    
}
