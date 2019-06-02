package com.thoughtworks.movierental;

public class ChildrensMovie implements IMovie{
    public double amount(int daysRented) {
        double amount = 0;
        amount += 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

    public int frequentRenterPoints(int daysRented){
        int frequentRenterPoints = 1;
        return frequentRenterPoints;
    }
}
