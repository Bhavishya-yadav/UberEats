package com.java.payment.paymentStrategy;

import com.java.payment.Payment;
import com.java.payment.paymentEnum.PaymentMode;
import com.java.payment.paymentEnum.PaymentStatus;

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