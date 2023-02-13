package org.fasttrackit.code.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantService(List<Restaurant> restaurants) {
        if (restaurants != null) {
            this.restaurants.addAll(restaurants);
        }
    }

    public List<Restaurant> getAllInACity(String city) {
        if (city == null || city.equals("")) {
            return new ArrayList<>();
        }
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (city.equals(restaurant.city())) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public List<Restaurant> getAllOfType(RestaurantType type) {
        if (type == null) {
            return new ArrayList<>();
        }
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (type.equals(restaurant.type())) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public Map<String, String> mapRestaurantNameToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.name(), restaurant.city());
        }
        return result;
    }

    public Map<Restaurant, RestaurantType> mapRestaurantToType() {
        Map<Restaurant, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant, restaurant.type());
        }
        return result;
    }

    public Map<RestaurantType, List<Restaurant>> groupByType() {
        Map<RestaurantType, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            if (result.containsKey(restaurant.type())) {
                result.get(restaurant.type()).add(restaurant);
            } else {
                List<Restaurant> values = new ArrayList<>();
                values.add(restaurant);
                result.put(restaurant.type(), values);
            }
        }
        return result;
    }
}
