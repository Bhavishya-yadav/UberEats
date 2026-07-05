package com.java.payment;

import java.util.HashMap;
import java.util.Map;

import com.java.payment.paymentConfig.PaymentConfig;
import com.java.payment.paymentEnum.PaymentMode;
import com.java.payment.paymentEnum.PaymentStatus;
import com.java.payment.paymentStrategy.PaymentStrategy;

public class PaymentManager {
    private Map<String, Payment> paymentMap;
    private Map<String, Payment> orderIdToPaymentMap;
    private static PaymentManager instance;

    private PaymentManager() {
        paymentMap = new HashMap<>();
        orderIdToPaymentMap = new HashMap<>();
    }

    public static synchronized PaymentManager getInstance() {
        if(instance == null) {
            instance = new PaymentManager();
        }
        return instance;
    }

    public boolean processPayment(String orderId, int amount, PaymentMode mode, PaymentConfig paymentConfig) {

        PaymentStrategy paymentStrategy = PaymentFactory.getPaymentStartegy(mode, paymentConfig);

        Payment payment = paymentStrategy.processPayment(orderId, amount);

        if(payment != null) {
            paymentMap.put(payment.getPaymentId(), payment);
            orderIdToPaymentMap.put(orderId, payment);

            return true;
        }

        return false;
    }

    public boolean collectCash(String orderId, int amount) {
        if(!orderIdToPaymentMap.containsKey(orderId)) {
            System.out.println("Order id is wrong!!!!");
            return false;
        }
        Payment payment = orderIdToPaymentMap.get(orderId);
        if (PaymentStatus.SUCCESS.equals(payment.getPaymentStatus())) {
            System.out.println("Payment already done!!!!");
            return false;
        }

        payment.setPaymentStatus(PaymentStatus.SUCCESS);
        System.out.println("Cash collect for orderId: " + orderId + " amount: " + amount);
        return true;
    }
}
