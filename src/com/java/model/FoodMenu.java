package com.java.model;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class FoodMenu {
    String menuId;
    Set<FoodItem> foodItems;

    public FoodMenu() {
        this.menuId = UUID.randomUUID().toString();
        this.foodItems = new HashSet<>();
    }

    public FoodMenu(Set<FoodItem> foodItems) {
        this.menuId = UUID.randomUUID().toString();
        this.foodItems = foodItems;
    }

    public String getMenuId() {
        return menuId;
    }

    public Set<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void addItemInMenu(FoodItem item) {
        this.foodItems.add(item);
    }

    public void removeItemInMenu(FoodItem item) throws Exception {
        this.foodItems.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu ID : ").append(menuId).append("\n");
        sb.append("Food Items:\n");

        for (FoodItem item : foodItems) {
            sb.append(item).append("\n");
        }

        return sb.toString();
    }
  
}
