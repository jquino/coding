package com.jalasoft.selenium.jose.movies;

/**
 * Main class.
 */
public final class Main {

    /**
     * This is the constructor.
     */
    private Main() { }
    /**
     * This is the main method.
     * @param args It receives some arguments.
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        System.out.println(customer.statement());
    }
}
