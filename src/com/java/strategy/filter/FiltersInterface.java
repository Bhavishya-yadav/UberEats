package com.java.strategy.filter;

import com.java.model.FoodItem;

public interface FiltersInterface {
    public boolean shouldShow(FoodItem foodItem);
}
