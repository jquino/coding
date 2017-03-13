package com.jalasoft.selenium.jose.movies;

/**
 * Created by Jose Rioja on 3/7/2017.
 */
public class Regular extends Movie {
    public static final double BASE_RENTAL_FEE = 2;
    public static final int RENTAL_PERIOD = 2;
    public static final double DAILY_RENTAL_RATE = 1.5;

    /**
     * This is the constructor.
     * @param movieTitle It is the title of the movie.
     */
    public Regular(final String movieTitle) {
        super(movieTitle);
    }

    /**
     * This method calculates the amount.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated amount.
     */
    double calculateAmount(final int daysRented) {
        return BASE_RENTAL_FEE + ((daysRented > RENTAL_PERIOD) ? (daysRented - RENTAL_PERIOD) * DAILY_RENTAL_RATE : 0);
    }
}
