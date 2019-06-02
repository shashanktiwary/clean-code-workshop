package com.thoughtworks.movierental;

import java.util.HashMap;
import java.util.Map;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private static Map<Integer, IMovie> moviesIocs = new HashMap<>();

    static {
        moviesIocs.put(CHILDRENS, new ChildrensMovie());
        moviesIocs.put(REGULAR, new RegularMovie());
        moviesIocs.put(NEW_RELEASE, new NewReleaseMovie());
    }

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    public double amount(int daysRented){
        IMovie movie = moviesIocs.get(getPriceCode());
        return movie.amount(daysRented);
    }

    public int frequentRenterPoints(int daysRented) {
        IMovie movie = moviesIocs.get(getPriceCode());
        return movie.frequentRenterPoints(daysRented);
    }

}