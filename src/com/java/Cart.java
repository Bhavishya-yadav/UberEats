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

    public void emptyCart() {
        this.foodItemToCartItemsMap.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cart ID: ").append(cartId).append("\n");
        sb.append("Items in Cart:\n");

        if (foodItemToCartItemsMap.isEmpty()) {
            sb.append("Cart is empty.");
            return sb.toString();
        }

        int totalAmount = 0;

        for (CartItem cartItem : foodItemToCartItemsMap.values()) {
            sb.append(cartItem).append("\n");
            totalAmount += cartItem.getPriceOfCartItem();
        }

        sb.append("---------------------------------\n");
        sb.append("Total Amount: ₹").append(totalAmount);

        return sb.toString();
    }
}
// user -> user.getcart -> cart.add
// usermanager -> user , add cart -
