package com.thoughtworks.movierental;

class TextStatement {
  private String name;
  private Rentals rentals;

  public TextStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String statement() {
    // add header lines show name of the customer
    String result = "Rental Record for " + name + "\n";

    for (Rental rental : rentals) {
      result += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(rental.movie.amount(rental.getDaysRented())) + "\n";
    }

    //add footer lines result
    result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
    result += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints())
        + " frequent renter points";

    return result;
  }

}
