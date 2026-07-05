package com.java.model;
import java.util.List;
import java.util.UUID;

import com.java.enums.OrderStatus;
import com.java.enums.TaxType;

public class Order {
    String orderId;
    List<CartItem> orderItems;
    String customerId;
    String restaurantId;
    String customerAddress;
    OrderStatus orderStatus;
    Bill bill;


    public Order(List<CartItem> orderItems, String customerId, String restaurantId, int cartAmount, String customerAddress) {
        this.orderId = UUID.randomUUID().toString();
        this.orderItems = orderItems;
        this.restaurantId = restaurantId;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.bill = new Bill(cartAmount);
        this.orderStatus = OrderStatus.SUCCESS;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<CartItem> getOrderItems() {
        return orderItems;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public int getFinalBillingAmount() {
        return (int)bill.calculateFinalBill();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void updateOrderStatus(OrderStatus status) {
        this.orderStatus = status;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void applyCoupon(Coupon coupon) {
        bill.addCoupon(coupon);
    }
    
    public void applyTax(TaxType tax) {
        bill.addTax(tax);
    }

    public int getCartAmount() {
        return bill.getCartAmount();
    }

    public Bill getBill() {
        return bill;
    }
    
}
