package com.pluralsight.tickets;

/**
 * Represents a ticket in the system.
 * Demonstrates instance variables and instance methods.
 * Each object has its own copy of instance variables.
 */
public class Ticket {

    private final long id;       // Unique per ticket → assigned via TicketFactory
    private String title;        // Instance variable → specific to this ticket

    // Constructor
    public Ticket(long id, String title) {
        this.id = id;
        this.title = title;
    }

    // Instance methods → operate on individual objects
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Display ticket details
    public void printDetails() {
        System.out.println("Ticket #" + id + " | Title: " + title);
    }
}
