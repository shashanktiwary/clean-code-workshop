package com.thoughtworks.movierental;

public class NewReleaseMovie implements IMovie {
    public double amount(int daysRented) {
        double amount = 0;
        amount += daysRented * 3;
        return amount;
    }

    public int frequentRenterPoints(int daysRented){
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if (daysRented> 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
