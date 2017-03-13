package com.jalasoft.selenium.jose.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Jose Rioja.
 */
class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * @param name This is the customer name.
     */
    Customer(final String name) {
        this.name = name;
    }

    /**
     * This method add rentals values to the vector.
     * @param arg This is a rental value that will be added to the vector.
     */
    public void addRental(final Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * This method gets the customer name.
     * @return returns the customer name.
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns a string with the amount owed and frequent renter points earned.
     * @return returns a string.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
//        String result = "Rental Record for " + getName() + "\n";
        StringBuffer result = new StringBuffer("");
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            double thisAmount = each.getMovie().calculateAmount(each.getDaysRented());
            // add frequent renter points and add bonus for a two day new release rental
            frequentRenterPoints += each.getMovie().calculateFrequentRenterPoints(each.getDaysRented());
            //show figures for this rental
//            result += "\t" + each.getMovie().getTitle() + "\t"
//                    + String.valueOf(thisAmount) + "\n";
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(String.valueOf(thisAmount))
                    .append("\n");
            totalAmount += thisAmount;
        }
        //add footer lines
//        result += "Amount owed is " + String.valueOf(totalAmount)
//        + "\n";
        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append("\n");
//        result += "You earned " + String.valueOf(frequentRenterPoints)
//                + " frequent renter points";
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(" frequent renter points");
        return result.toString();
    }
}
