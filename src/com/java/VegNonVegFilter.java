package com.java;
public class VegNonVegFilter implements FiltersInterface {

    boolean shouldShowVegItem;

    public VegNonVegFilter(boolean shouldShowVegItem) {
        this.shouldShowVegItem = shouldShowVegItem;
    }

    @Override
    public boolean shouldShow(FoodItem foodItem) {
        return foodItem.isVeg() == shouldShowVegItem;
    }
    
}
