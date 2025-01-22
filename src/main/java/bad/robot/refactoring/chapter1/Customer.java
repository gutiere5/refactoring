package bad.robot.refactoring.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
        	result += String.format("\t%s\t%s\n", rental.getMovie().getTitle(), String.valueOf(rental.getChargeFor()));         
        }        
        result += String.format("Amount owed is %s\n", String.valueOf(getTotalAmount(rentals)));
       // result += String.format("You earned %s frequent renter points", String.valueOf(calculateFrequentRenterPoints()));
        return result;
    }

	private double getTotalAmount(List<Rental> rentals2) {
		double totalAmount = 0;
		return totalAmount;
	}
	
	private int calculateFrequentRenterPoints(Rental rental) {
		if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1)
			return 2;
		return 1;
	}
	
	private int getFrequentRenterPoints() {
        int total = 0;
        for (Rental rental : rentals)
            total += rental.getFrequentRenterPoints();
        return total;
    }
}
