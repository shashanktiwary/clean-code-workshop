package com.thoughtworks.movierental;

public interface IMovie {
    double amount(int daysRented);

    int frequentRenterPoints(int daysRented);
}
