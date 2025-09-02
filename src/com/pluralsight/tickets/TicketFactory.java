package com.pluralsight.tickets;

/**
 * Demonstrates the use of static variables and methods.
 * A static counter is shared across all instances to generate unique ticket IDs.
 */
public class TicketFactory {

    // Static counter → shared by all objects of this class
    private static long counter = 1000;

    // Static method to generate unique IDs
    private static long generateId() {
        return ++counter;
    }

    // Public factory method → creates a new Ticket object
    public static Ticket createTicket(String title) {
        long id = generateId();
        return new Ticket(id, title);
    }

    // Expose current counter (for demo)
    public static long getCurrentCounter() {
        return counter;
    }
}
