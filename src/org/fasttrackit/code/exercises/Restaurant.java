package org.fasttrackit.code.exercises;

public record Restaurant(
        String name,
        String city,
        RestaurantType type,
        RestaurantRating rating
) {
}
