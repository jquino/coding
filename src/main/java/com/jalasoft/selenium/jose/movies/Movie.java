package com.jalasoft.selenium.jose.movies;

public abstract class Movie {
    private String _title;
    private int _priceCode;

    public Movie(String title) {
        _title = title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    abstract double calculateAmount(int daysRented);

    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}