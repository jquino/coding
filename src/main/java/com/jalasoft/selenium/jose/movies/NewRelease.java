package com.jalasoft.selenium.jose.movies;

/**
 * Created by Jose Rioja on 3/7/2017.
 */
public class NewRelease extends Movie {
    public static final double DAILY_RENTAL_RATE = 3;
    public static final int FREQUENT_RENTER_BONUS = 1;

    /**
     * This is the constructor.
     * @param movieTitle It is the title of the movie.
     */
    public NewRelease(final String movieTitle) {
        super(movieTitle);
    }

    /**
     * This method calculates the amount.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated amount.
     */
    public double calculateAmount(final int daysRented) {
        return daysRented * DAILY_RENTAL_RATE;
    }

    /**
     * This method calculates the frequent renter points.
     * @param daysRented It is the number of days that were rented.
     * @return returns the calculated frequent renter points.
     */
    public int calculateFrequentRenterPoints(final int daysRented) {
        return FREQUENT_RENTER_BONUS + ((daysRented > 1) ? FREQUENT_RENTER_BONUS : 0);
    }
}
