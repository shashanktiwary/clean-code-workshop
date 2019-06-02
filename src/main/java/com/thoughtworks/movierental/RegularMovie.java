package com.thoughtworks.movierental;

public class RegularMovie implements IMovie {
    public double amount(int daysRented) {
        double amount = 0;
        amount += 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }

    public int frequentRenterPoints(int daysRented){
        int frequentRenterPoints = 1;
        return frequentRenterPoints;
    }
}
