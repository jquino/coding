package com.jalasoft.selenium.jose.movies;

/**
 * Created by Jose Rioja on 3/7/2017.
 */
public class Children extends Movie {
    private static final double BASE_RENTAL_FEE = 1.5;
    public static final int RENTAL_PERIOD = 3;
    public static final double DAILY_RENTAL_RATE = 1.5;

    /**
     * @param movieTitle This is the title of the movie.
     */
    public Children(final String movieTitle) {
        super(movieTitle);
    }

    /**
     * @param daysRented This is the value of the rented days.
     * @return It returns the value calculated for Amount.
     */
    public double calculateAmount(final int daysRented) {
        return BASE_RENTAL_FEE + ((daysRented > RENTAL_PERIOD) ? (daysRented - RENTAL_PERIOD) * DAILY_RENTAL_RATE : 0);
    }
}
