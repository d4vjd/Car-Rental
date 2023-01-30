import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RentalAgenda {
    private List<Rental> rentals;

    public RentalAgenda() {
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
        this.sortRentals();
    }

    private void sortRentals() {
        Collections.sort(this.rentals, new Comparator<Rental>() {
            @Override
            public int compare(Rental rental1, Rental rental2) {
                return rental1.getEndDate().compareTo(rental2.getEndDate());
            }
        });
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
        this.sortRentals();
    }

    public void displayRentals() {
        for (Rental rental : this.rentals) {
            System.out.println("Rental ID: " + rental.getRentalId());
            System.out.println("Car: " + rental.getRentedCar().getMake() + " " + rental.getRentedCar().getModel());
            System.out.println("Client: " + rental.getClient().getName());
            System.out.println("Start Date: " + rental.getStartDate());
            System.out.println("End Date: " + rental.getEndDate());
            System.out.println("Rental Fee: " + rental.getRentalFee());
            System.out.println("---------------------------------");
        }
    }

    public void assign(RentalAgenda otherAgenda) {
        this.rentals = new ArrayList<>(otherAgenda.rentals);
    }

}