package com.jalasoft.selenium.jose.movies;

/**
 * Rental class.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Rental constructor.
     * @param movie It is a movie object.
     * @param daysRented It is the days that the movie was rented.
     */
    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method gets the number of rented days.
     * @return returns the number of rented days.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * This method gets the movie object.
     * @return returns the movie object.
     */
    public Movie getMovie() {
        return movie;
    }
}
