package com.java;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RestaurantManager {
    private Map<String, Restaurant> restaurantsMap;
    private Map<String, Set<Restaurant>> cityToRestaurantsMap;
    private static RestaurantManager instance;

    private RestaurantManager() {
        restaurantsMap = new HashMap<>();
        cityToRestaurantsMap = new HashMap<>();
    }

    public static synchronized RestaurantManager getInstance() {
        if(instance == null)
            instance = new RestaurantManager();
        return instance;
    }
    
    public void addRestaurant(Restaurant restaurant) {
        restaurantsMap.put(restaurant.getRestaurantId(), restaurant);
        String city = restaurant.getCityName();
        cityToRestaurantsMap.putIfAbsent(city, new HashSet<>());
        cityToRestaurantsMap.get(city).add(restaurant);
    }

    public void removeRestaurant(String restaurantId) throws Exception {
        if(!restaurantsMap.containsKey(restaurantId)) {
            throw new Exception("Restaurant Doesn't exist");
        }
        Restaurant restaurant = restaurantsMap.get(restaurantId);
        String city = restaurant.getCityName();
        restaurantsMap.remove(restaurantId);
        cityToRestaurantsMap.get(city).remove(restaurant);
        if(cityToRestaurantsMap.get(city).isEmpty()) {
            cityToRestaurantsMap.remove(city);
        }
    }

    public Restaurant getRestaurantById(String restaurantId) throws Exception {
        if(!restaurantsMap.containsKey(restaurantId)) {
            throw new Exception("Restaurant Doesn't exist");
        }
        return restaurantsMap.get(restaurantId);
    }

    public Set<Restaurant> getAllRestaurantsInCity(String city) {
        if(!cityToRestaurantsMap.containsKey(city)) {
            System.out.println("No restaurants available in city!!!");
        }
        return cityToRestaurantsMap.get(city);
    }

    public Set<Restaurant> searchRestaurantByName(String restaurantName) {
        return restaurantsMap.values().stream()
        .filter(restaurant -> restaurant.getRestaurantName().contains(restaurantName))
        .collect(Collectors.toSet());
    }
}
