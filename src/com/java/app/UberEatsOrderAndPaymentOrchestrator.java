package com.java.app;

import java.util.List;

import com.java.config.PaymentConfig;
import com.java.enums.OrderStatus;
import com.java.enums.PaymentMode;
import com.java.enums.TaxType;
import com.java.model.Cart;
import com.java.model.Coupon;
import com.java.model.Order;
import com.java.service.OrderManager;
import com.java.service.PaymentManager;

public class UberEatsOrderAndPaymentOrchestrator {

    OrderManager orderManager = OrderManager.getInstance();
    PaymentManager paymentManager = PaymentManager.getInstance();
    
    public String handleOrderAndPayment(Cart cart, String customerId, String restaurantId, String customerAddress,  PaymentMode paymentMode, PaymentConfig paymentConfig, List<Coupon> appliedCoupons) {
        Order order = orderManager.placeOrder(cart, customerId, restaurantId, customerAddress);
        if(order == null) {
            System.out.println("Order not placed, Please try again!!!!");
            return null;
        }
        // Adding coupons
        appliedCoupons.forEach(coupon -> order.applyCoupon(coupon));
        // Adding taxes
        order.applyTax(TaxType.CGST);
        order.applyTax(TaxType.SGST);

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
            paymentManager.collectCash(orderId, order.getFinalBillingAmount());
            return true;
        } catch(Exception e) {
            System.out.println("Cant collect cash for order: " + orderId + " " + e);
            return false;
        }
    }

    public void showBill(String orderId) {
        orderManager.showBill(orderId);
    }
}
