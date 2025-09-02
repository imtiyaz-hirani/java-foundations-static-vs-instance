package com.pluralsight.constants;

/**
 * Demonstrates static constants.
 * Static variables belong to the class rather than individual objects.
 * Static final constants are used for fixed values that never change.
 */
public final class Constants {

    // Prevent instantiation
    private Constants() {}

    // Static final constants → shared and immutable
    public static final String APP_NAME = "Pluralsight Ticket System";
    public static final String COMPANY_NAME = "Pluralsight Inc.";
    public static final int MAX_USERS = 1000;
    public static final double GST_RATE = 18.0; // percentage

    // Static variable → shared mutable value
    public static int globalTicketCounter = 0;
}
