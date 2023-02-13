package org.fasttrackit.code.enums;

public enum CardinalPoints {
    NORTH("N", "Arial"),
    SOUTH("S", "Arial"),
    EAST("E", "Arial"),
    WEST("W", "Arial");

    private final String symbol;
    private final String fontStyle;

    CardinalPoints(String symbol, String fontStyle) {
        this.symbol = symbol;
        this.fontStyle = fontStyle;
    }

    public String toDirection() {
        return switch (this) {
            case NORTH -> "UP";
            case EAST -> "RIGHT";
            case SOUTH -> "DOWN";
            case WEST -> "LEFT";
        };
    }

    public static CardinalPoints fromSymbol(String symbol) {
        for (CardinalPoints value : CardinalPoints.values()) {
            if (value.symbol.equals(symbol)) {
                return value;
            }
        }
        return null;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getFontStyle() {
        return fontStyle;
    }
}
