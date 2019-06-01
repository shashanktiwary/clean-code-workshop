package com.thoughtworks.movierental;

class TextStatement {
  private String name;
  private Rentals rentals;

  public TextStatement(String name, Rentals rentals) {
    this.name = name;
    this.rentals = rentals;
  }

  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = "Rental Record for " + name + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(rental.amount()) + "\n";
    }

    frequentRenterPoints = rentals.totalFrequentRenterPoints();
    totalAmount = rentals.totalAmount();

    //add footer lines result
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints)
        + " frequent renter points";
    return result;
  }

}
