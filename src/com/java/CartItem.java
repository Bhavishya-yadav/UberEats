package com.java;
public class CartItem {
    private FoodItem foodItem;
    private int quantity;

    public CartItem(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public void increaseQuantityOfFoodItem() {
        this.quantity += 1;
    }

    public void decreaseQuantityOfFoodItem() {
        if(quantity <= 0) {
            System.out.println("Can't decrease quantity of food item as it is already zero");
            return;
        }
        this.quantity -= 1; 
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPriceOfCartItem() {
        return quantity*foodItem.getPrice();
    }
}
