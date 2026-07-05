package com.java;
import java.util.List;
import java.util.UUID;

public class Order {
    String orderId;
    List<CartItem> orderItems;
    String customerId;
    String restaurantId;
    int orderAmount;
    String customerAddress;
    OrderStatus orderStatus;


    public Order(List<CartItem> orderItems, String customerId, String restaurantId, int orderAmount, String customerAddress) {
        this.orderId = UUID.randomUUID().toString();
        this.orderItems = orderItems;
        this.restaurantId = restaurantId;
        this.customerId = customerId;
        this.orderAmount = orderAmount;
        this.customerAddress = customerAddress;
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

    public int getOrderAmount() {
        return orderAmount;
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
    
    
}
