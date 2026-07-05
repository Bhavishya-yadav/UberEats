package com.java.strategy.filter;

import com.java.model.FoodItem;

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
