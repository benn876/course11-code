package org.fasttrackit.code.enums;

public enum ComplexCardinalPoint {
    NORTH_WEST(CardinalPoints.NORTH, CardinalPoints.WEST),
    NORTH_EAST(CardinalPoints.NORTH, CardinalPoints.EAST),
    SOUTH_WEST(CardinalPoints.SOUTH, CardinalPoints.WEST),
    SOUTH_EAST(CardinalPoints.SOUTH, CardinalPoints.EAST);

    private final CardinalPoints firstDirection;
    private final CardinalPoints secondDirection;

    ComplexCardinalPoint(CardinalPoints firstDirection, CardinalPoints secondDirection) {
        this.firstDirection = firstDirection;
        this.secondDirection = secondDirection;
    }

    public CardinalPoints getFirstDirection() {
        return firstDirection;
    }

    public CardinalPoints getSecondDirection() {
        return secondDirection;
    }
}
