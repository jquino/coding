package com.jalasoft.selenium.jose.movies;

import com.jalasoft.selenium.jose.movies.NewRelease;
import com.jalasoft.selenium.jose.movies.Regular;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        System.out.println(customer.statement());
    }
}