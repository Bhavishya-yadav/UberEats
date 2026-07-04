package com.java;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Cart {
    String cartId;
    Map<String, CartItem> foodItemToCartItemsMap;

    public Cart() {
        this.cartId = UUID.randomUUID().toString();
        this.foodItemToCartItemsMap = new HashMap<>();
    }

    public boolean addItemInCart(FoodItem foodItem) {
        if(!foodItemToCartItemsMap.containsKey(foodItem.getFoodItemId())) {
            CartItem cartItem = new CartItem(foodItem, 0);
            foodItemToCartItemsMap.put(foodItem.getFoodItemId(), cartItem);
        }
        foodItemToCartItemsMap.get(foodItem.getFoodItemId()).increaseQuantityOfFoodItem();
        return true;
    }

    public boolean removeItemFromCart(FoodItem foodItem) {
        String foodItemId = foodItem.getFoodItemId();
        if(!foodItemToCartItemsMap.containsKey(foodItemId)) {
            System.out.println("Item doesn't exist in cart!!!!");
            return false;
        }
        CartItem cartItem= foodItemToCartItemsMap.get(foodItem.getFoodItemId());
        cartItem.decreaseQuantityOfFoodItem();
        if(cartItem.getQuantity() <= 0) {
            foodItemToCartItemsMap.remove(foodItemId);
        }
        return true;
    }
}
