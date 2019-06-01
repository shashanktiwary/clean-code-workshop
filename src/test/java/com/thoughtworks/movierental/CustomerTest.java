package com.thoughtworks.movierental;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {
    @Test
    public void shouldGenerateTextStatement() {
        Customer customer = new Customer("Tony Stark");

        customer.addRental(new Rental(new Movie("Avengers Endgame", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("Spiderman homecoming", Movie.CHILDRENS), 7));
        customer.addRental(new Rental(new Movie("Iron man", Movie.REGULAR), 7));

        String statement = customer.statement();
        assertEquals("Rental Record for Tony Stark\n" +
                "\tAvengers Endgame\t15.0\n" +
                "\tSpiderman homecoming\t7.5\n" +
                "\tIron man\t9.5\n" +
                "Amount owed is 32.0\n" +
                "You earned 4 frequent renter points", statement);
    }

    @Test
    public void shouldGenerateHtmlStatement() {

        Customer customer = new Customer("Tony Stark");

        customer.addRental(new Rental(new Movie("Avengers: Endgame", Movie.NEW_RELEASE), 4));
        customer.addRental(new Rental(new Movie("Iron Man", Movie.REGULAR), 4));
        customer.addRental(new Rental(new Movie("Spider-man: Homecoming", Movie.CHILDRENS), 4));

        String statement = customer.htmlStatement();

        assertEquals("<h3>Rental Record for Tony Stark</h3>" +
                "<p>" +
                "Avengers: Endgame: <b>12.0</b>" +
                "Iron Man: <b>5.0</b>" +
                "Spider-man: Homecoming: <b>3.0</b>" +
                "</p>" +
                "<p>Amount owed is <b>20.0</b></p>" +
                "<p>You earned <b>4</b> frequent renter points</p>", statement);
    }

}