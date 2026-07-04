package com.java.payment;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public Payment processPayment(String orderId, int amount) {
        Payment payment = new Payment(orderId, amount, PaymentMode.CASH);
        System.out.println("Payment will done via COD!!!");
        payment.setPaymentStatus(PaymentStatus.PENDING);
        return payment;
    } 
}
/*


ubereats -> src -> payment
cart -> 

*/