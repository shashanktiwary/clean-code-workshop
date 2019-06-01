package com.thoughtworks.movierental;

class HtmlStatement {

  private String name;
  private Rentals rentals;

  public HtmlStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String statement() {
    String result = "<h3>Rental Record for " + name + "</h3>";

    result += "<p>";
    for (Rental rental : rentals) {
      //show figures for this rental
      result += rental.getMovie().getTitle() + ": <b>" +
              String.valueOf(rental.amount()) + "</b>";

    }
    result += "</p>";

//add footer lines result
    result += "<p>Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b></p>";
    result += "<p>You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints())
            + "</b> frequent renter points</p>";
    return result;
  }
}
