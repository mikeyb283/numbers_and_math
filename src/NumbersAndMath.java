import java.util.Scanner;

public class NumbersAndMath {

  public static void main(String[] args) {
    double order = -1;                            // price of each item
    double total = 0.00;                          // cumulative total price of each item

    Scanner orderCost = new Scanner(System.in);


    System.out.println("TIP CALCULATOR.");
    System.out.println("Enter the cost of each the order, enter 0 to finish and see your total.");

    // loop to end user input
    while (order != 0) {
      System.out.println("Order cost: ");
      order = orderCost.nextDouble();
      total += order;
    }

    double tax = total * .025;              // calculate tax
    double taxTotal = (total + tax);        // add tax to total
    double tip = (.175 * taxTotal);         // calculate tip
    double grandTotal = (taxTotal + tip);   // add tip to total

    // using (java.text.NumberFormat.getCurrencyInstance().format()) to display in currency form with $
    System.out.println("Subtotal:      " + (java.text.NumberFormat.getCurrencyInstance().format(total)));
    System.out.println("Sales Tax:     " + (java.text.NumberFormat.getCurrencyInstance().format(tax)));
    System.out.println("Total + Tax:   " + (java.text.NumberFormat.getCurrencyInstance().format(taxTotal)));
    System.out.println("Suggested Tip: " + (java.text.NumberFormat.getCurrencyInstance().format(tip)));
    System.out.println("Balance Due:   " + (java.text.NumberFormat.getCurrencyInstance().format(grandTotal)));
  }
}

