package org.example;

import java.util.Random;

/**
 * RNGTools provides utility methods for generating random values,
 * such as random integers, coin flips, dice rolls, and item selections.
 */
public class RNGTools {

    /**
     * Generates a random integer between the given min and max (inclusive).
     *
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return a random integer between min and max
     */
    public static int randomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    /**
     * Simulates a coin flip, returning either "Heads" or "Tails".
     *
     * @return "Heads" or "Tails" based on the coin flip
     */
    public static String flipCoin() {
        Random rand = new Random();
        return rand.nextBoolean() ? "Heads" : "Tails";
    }

    /**
     * Rolls a die with the given number of sides.
     *
     * @param sides the number of sides on the die (must be >= 1)
     * @return a random number between 1 and the specified number of sides
     * @throws IllegalArgumentException if the sides parameter is less than 1
     */
    public static int rollDie(int sides) {
        if (sides < 1) throw new IllegalArgumentException("Die must have at least 1 side.");
        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }

    /**
     * Picks a random element from the provided array of items.
     *
     * @param items an array of items to choose from
     * @return a random item from the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static String pickOne(String[] items) {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }
        Random rand = new Random();
        return items[rand.nextInt(items.length)];
    }

    // Main method for testing the RNGTools methods
    public static void main(String[] args) {
        System.out.println("Random int: " + randomInt(1, 100));
        System.out.println("Coin flip: " + flipCoin());
        System.out.println("Roll D20: " + rollDie(20));
        System.out.println("Random fruit: " + pickOne(new String[]{"Apple", "Banana", "Orange"}));
    }
}
