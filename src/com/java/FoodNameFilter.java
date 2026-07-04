package com.java;

public class FoodNameFilter implements FiltersInterface {
    String foodName;

    public FoodNameFilter(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public boolean shouldShow(FoodItem foodItem) {
        return foodItem.getName().equals(foodName);
    }
}
