package com.java;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private FoodMenu foodMenu;
    private String cityName;

    public Restaurant(String restaurantName, String cityName) {
        this.restaurantName = restaurantName;
        this.foodMenu = null;
        this.restaurantId = UUID.randomUUID().toString();
        this.cityName = cityName;
    }

    public Restaurant(String restaurantName, String cityName, FoodMenu foodMenu) {
        this.restaurantName = restaurantName;
        this.foodMenu = foodMenu;
        this.restaurantId = UUID.randomUUID().toString();
        this.cityName = cityName;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public String getCityName() {
        return cityName;
    }

    public void addItemInFoodMenu(FoodItem foodItem) {
        foodMenu.addItemInMenu(foodItem);
    }
    
    public void removeItemFromFoodMenu(FoodItem foodItem) throws Exception {
        foodMenu.removeItemInMenu(foodItem);
    }

    public List<FoodItem> getFilteredFoodItems(List<FiltersInterface> filters) {
        List<FoodItem> foodItems = foodMenu.getFoodItems().stream()
                                        .filter(foodItem -> {
                                                return (filters == null) || filters.isEmpty() || filters.stream().allMatch(filter -> filter.shouldShow(foodItem));
                                            }).toList();
        return foodItems;                                   
    }
}
