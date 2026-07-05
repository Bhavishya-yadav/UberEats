package com.java.strategy.payment;

import com.java.enums.CuisineType;
import com.java.model.FoodItem;
import com.java.strategy.filter.FiltersInterface;

public class CuisineBasedFilter implements FiltersInterface {
    CuisineType cuisineType;

    public CuisineBasedFilter(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public boolean shouldShow(FoodItem foodItem) {
        return foodItem.getType().equals(this.cuisineType);
    }
}
