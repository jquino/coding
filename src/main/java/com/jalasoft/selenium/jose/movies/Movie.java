package com.jalasoft.selenium.jose.movies;

/**
 * This is the Movie class.
 */
public abstract class Movie {
    private String title;
    private int priceCode;

    /**
     * This method assigns a title to the movie.
     * @param title It is the title of the movie.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * This method gets the price of the code.
     * @return returns the price of the code.
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * This method sets the price of the code.
     * @param arg It is the price of the code.
     */
    public void setPriceCode(final int arg) {
        priceCode = arg;
    }

    /**
     * This method gets the title of the movie.
     * @return returns the title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This is the method to calculate the amount.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated amount.
     */
    abstract double calculateAmount(int daysRented);

    /**
     * This method calculates the frequent renter points.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated frequent renter points.
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
