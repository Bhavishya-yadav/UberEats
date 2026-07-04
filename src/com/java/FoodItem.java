package com.java;
import java.util.UUID;

public class FoodItem {
    String foodItemId;
    String name;
    CuisineType type;
    boolean isVeg;
    int price;
    public FoodItem(String name, CuisineType type, boolean isVeg, int price) {
        this.foodItemId = UUID.randomUUID().toString();
        this.name = name;
        this.type = type;
        this.isVeg = isVeg;
        this.price = price;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public String getName() {
        return name;
    }

    public CuisineType getType() {
        return type;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public int getPrice() {
        return price;
    }
}
