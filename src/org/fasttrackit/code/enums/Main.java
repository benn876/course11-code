package org.fasttrackit.code.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardinalPoints northCardinalPoint = CardinalPoints.NORTH;

        CardinalPoints southCardinalPoint = CardinalPoints.fromSymbol("S");
        System.out.println(southCardinalPoint.name());

        System.out.println(northCardinalPoint.getSymbol());
        Scanner scanner = new Scanner(System.in);
        String symbolFromKeyboard = scanner.nextLine();
        CardinalPoints givenFromKeyboard = CardinalPoints.fromSymbol(symbolFromKeyboard);
        if (givenFromKeyboard != null) {
            switch (givenFromKeyboard) {
                case NORTH -> System.out.println("go up");
                case SOUTH -> System.out.println("go down");
                case EAST -> System.out.println("go right");
                case WEST -> System.out.println("go lef");
            }
            System.out.println(givenFromKeyboard.toDirection());
        }

    }
}
