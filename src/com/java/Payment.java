package com.java;
import java.util.UUID;

public class Payment {
    private String paymentId;
    private String orderId;
    private PaymentStatus paymentStatus; 
    private int amount;
    private PaymentMode paymentMode;
    
    public Payment(String orderId, int amount, PaymentMode paymentMode) {
        this.paymentId = UUID.randomUUID().toString();
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public int getAmount() {
        return amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
}
