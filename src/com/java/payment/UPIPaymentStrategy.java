package com.java.payment;

public class UPIPaymentStrategy implements PaymentStrategy {

    private String customerUpiId;

    public UPIPaymentStrategy(String customerUpiId) {
        this.customerUpiId = customerUpiId;
    }

    @Override
    public Payment processPayment(String orderId, int amount) {
        Payment payment = new Payment(orderId, amount, PaymentMode.UPI);
        System.out.println("Payment processing");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            payment.setPaymentStatus(PaymentStatus.FAILED);
            System.out.println(e.getMessage());
            return payment;
        }
        System.out.println("Payment done via UPI: " +  customerUpiId);
        payment.setPaymentStatus(PaymentStatus.SUCCESS);
        return payment;
    }
    
}
