package com.pluralsight.app;

import com.pluralsight.constants.Constants;
import com.pluralsight.utils.MathUtils;
import com.pluralsight.tickets.Ticket;
import com.pluralsight.tickets.TicketFactory;
import com.pluralsight.pitfalls.StaticPitfalls;

public class App {

    public static void main(String[] args) {
        System.out.println("=== Java Static vs Instance Members Demo ===\n");

        // === 1. Static Constants ===
        System.out.println("App Name: " + Constants.APP_NAME);
        System.out.println("Company: " + Constants.COMPANY_NAME);
        System.out.println("Max Users Allowed: " + Constants.MAX_USERS);
        System.out.println();

        // === 2. Static Utility Methods ===
        int sum = MathUtils.add(10, 20);
        int product = MathUtils.multiply(5, 6);
        int square = MathUtils.square(7);
        int cube = new MathUtils().cube(3);  // instance method usage

        System.out.println("Sum (Static): " + sum);
        System.out.println("Product (Static): " + product);
        System.out.println("Square (Static): " + square);
        System.out.println("Cube (Instance): " + cube);
        System.out.println();

        // === 3. Instance Members vs Static Counter ===
        Ticket t1 = TicketFactory.createTicket("Login Bug");
        Ticket t2 = TicketFactory.createTicket("Payment Failure");
        Ticket t3 = TicketFactory.createTicket("New Feature Request");

        t1.printDetails();
        t2.printDetails();
        t3.printDetails();

        System.out.println("Current Global Ticket Counter: " + TicketFactory.getCurrentCounter());
        System.out.println();

        // === 4. Mutable Static Pitfalls ===
        StaticPitfalls bug1 = new StaticPitfalls("Bug Ticket");
        StaticPitfalls bug2 = new StaticPitfalls("Feature Ticket");

        bug1.addTag("Urgent");
        bug2.addTag("Frontend");
        bug1.addTag("Backend");

        bug1.showTags();  // Shows all tags added so far
        bug2.showTags();  // Same tags shown here → unexpected for beginners!

        System.out.println("\n=== End of Demo ===");
    }
}