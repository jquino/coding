package com.jalasoft.selenium.jose.movies;

/**
 * Created by Jose Rioja on 3/7/2017.
 */
public class NewRelease extends Movie {

    public NewRelease(String movieTitle) {
        super(movieTitle);
    }

    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}