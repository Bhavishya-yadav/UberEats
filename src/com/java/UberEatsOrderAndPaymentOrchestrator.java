package com.java;

import com.java.payment.PaymentManager;
import com.java.payment.paymentConfig.PaymentConfig;
import com.java.payment.paymentEnum.PaymentMode;

public class UberEatsOrderAndPaymentOrchestrator {

    OrderManager orderManager = OrderManager.getInstance();
    PaymentManager paymentManager = PaymentManager.getInstance();
    
    public String handleOrderAndPayment(Cart cart, String customerId, String restaurantId, String customerAddress,  PaymentMode paymentMode, PaymentConfig paymentConfig) {
        Order order = orderManager.placeOrder(cart, customerId, restaurantId, customerAddress);
        if(order == null) {
            System.out.println("Order not placed, Please try again!!!!");
            return null;
        }
        boolean isOrderAndPaymentSuccessful = paymentManager.processPayment(order.getOrderId(), cart.getTotalCartAmount(), paymentMode, paymentConfig);
        if(!isOrderAndPaymentSuccessful) {
            order.updateOrderStatus(OrderStatus.FAILED);
            System.out.println("Payment failed for order!!! " + order.getOrderId());
        } else {
            System.out.println("Payment is successful!!! via " + paymentMode.name());
        }

        return order.getOrderId();
    }

    public boolean collectCashOfCODOrder(String orderId) {
        try {
            Order order = orderManager.getOrderById(orderId);
            paymentManager.collectCash(orderId, order.getOrderAmount());
            return true;
        } catch(Exception e) {
            System.out.println("Cant collect cash for order: " + orderId + " " + e);
            return false;
        }
    }
}
