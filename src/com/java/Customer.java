package com.java;
import java.util.UUID;

public class Customer {
    String id;
    String name;
    String address;
    Cart cart;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = UUID.randomUUID().toString();
        cart = new Cart();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }

    public void emptyCart() {
        cart.emptyCart();
    }
    
}
