package com.pluralsight.utils;

/**
 * Demonstrates the difference between static utility methods and instance methods.
 * Static methods belong to the class and can be called without creating objects.
 * Instance methods require object creation.
 */
public class MathUtils {

    // === Static Utility Methods ===
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int number) {
        return number * number;
    }

    // === Instance Method ===
    public int cube(int number) {
        return number * number * number;
    }
}
