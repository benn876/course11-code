package org.fasttrackit.code.exercises;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService(List.of(
           new Restaurant("Continental","Oradea",RestaurantType.ROMANIAN,RestaurantRating.THREE_STARS),
           new Restaurant("Hilton","America",RestaurantType.FUSION,RestaurantRating.ONE_STAR),
           new Restaurant("Marty","Cluj",RestaurantType.FUSION,RestaurantRating.FIVE_STARS)
        ));

        System.out.println(restaurantService.getAllInACity("Oradea"));
        System.out.println(restaurantService.getAllOfType(RestaurantType.FUSION));
        System.out.println(restaurantService.mapRestaurantNameToCity());
        System.out.println(restaurantService.groupByType());
    }
}
