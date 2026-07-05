package com.java.service;
import java.util.HashMap;
import java.util.Map;

import com.java.enums.OrderStatus;
import com.java.model.Cart;
import com.java.model.Order;

public class OrderManager {
    private Map<String, Order> orderMap;
    private static OrderManager instance;

    private OrderManager() {
        orderMap = new HashMap<>();
    }

    public static synchronized OrderManager getInstance() {
        if(instance == null)
            instance = new OrderManager();
        return instance;
    }
    
    public Order placeOrder(Cart cart, String customerId, String restaurantId, String customerAddress) {
        Order order = new Order(cart.getAllCartItemsInCart(), customerId, restaurantId, cart.getTotalCartAmount(), customerAddress);
        orderMap.put(order.getOrderId(), order);
        return order;
    }

    public Order getOrderById(String orderId) throws Exception {
        if(!orderMap.containsKey(orderId)) {
            throw new Exception("No Such Order exist!!!");
        }
        return orderMap.get(orderId);
    }

    public boolean setOrderStatus(String orderId, OrderStatus orderStatus) {
        try {
            Order order = getOrderById(orderId);
            order.updateOrderStatus(orderStatus);
            return true;
        } catch(Exception e) {
            System.out.println("Error in setting up OrderStatus " + e.getMessage());
            return false;
        }
    }

    public void showBill(String orderId) {
        try {
            Order order = getOrderById(orderId);
            System.out.println("\nBill for order\n" + order.getBill() + "\n");
        } catch(Exception e) {
            System.out.println("Error in setting up OrderStatus " + e.getMessage());
            
        }
    }
}
