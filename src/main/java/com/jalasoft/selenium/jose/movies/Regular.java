package com.jalasoft.selenium.jose.movies;

import com.jalasoft.selenium.jose.movies.Movie;

/**
 * Created by Jose Rioja on 3/7/2017.
 */
public class Regular extends Movie {
    private static final int BASE_PRICE = 2;

    public Regular(String movieTitle) {
        super(movieTitle);
    }

    double calculateAmount(int daysRented) {
        return (daysRented > 2) ? BASE_PRICE + ((daysRented - 3) * 1.5) : BASE_PRICE;
    }
}