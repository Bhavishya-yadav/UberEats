package com.java;
import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private Map<String, Customer> customersMap;

    private static CustomerManager instance;

    private CustomerManager() {
        customersMap = new HashMap<>();
    }

    public static synchronized CustomerManager getInstance() {
        if(instance == null)
            instance = new CustomerManager();
        return instance;
    }
    
    public void addCustomer(Customer customer) {
        customersMap.put(customer.getId(), customer);
    }

    public void removeCustomer(String customerId) throws Exception {
        if(!customersMap.containsKey(customerId)) {
            throw new Exception("Customer Doesn't exist");
        }
        customersMap.remove(customerId);
    }

    public void updateCustomer(Customer customer) throws Exception {
        if(!customersMap.containsKey(customer.getId())) {
            throw new Exception("Customer Doesn't exist");
        }
        customersMap.put(customer.getId(), customer);
    }

    public Customer getCustomerById(String customerId) throws Exception {
        if(!customersMap.containsKey(customerId)) {
            throw new Exception("Customer Doesn't exist");
        }
        return customersMap.get(customerId);
    }

    public void addItemInCart(String customerId, FoodItem foodItem) throws Exception {
        Customer customer = getCustomerById(customerId);
        customer.getCart().addItemInCart(foodItem);
    }

    public void removeItemFromCart(String customerId, FoodItem foodItem) throws Exception {
        Customer customer = getCustomerById(customerId);
        customer.getCart().removeItemFromCart(foodItem);
    }
}
