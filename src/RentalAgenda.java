import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RentalAgenda {
    private static RentalAgenda instance = null;
    private List<Rental> rentals;

    private RentalAgenda() {
        this.rentals = new ArrayList<>();
    }

    public static RentalAgenda getInstance() {
        if (instance == null) {
            instance = new RentalAgenda();
        }
        return instance;
        //The first time this method is called, a new instance of the RentalAgenda
        //class is created and stored in the instance variable. Subsequent calls to
        //the getInstance() method will return the same instance stored in the instance
        //variable, ensuring that there is only one instance of the RentalAgenda class in
        //the entire program.
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

    public void deleteRentalFromRentalAgenda(int id) {
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i).getRentalId() == id) {
                rentals.remove(i);
                System.out.println("Rental with ID " + id + " has been removed from the RentalAgenda.");
                return;
            }
        }
        System.out.println("Rental with ID " + id + " was not found in the RentalAgenda.");
    }

    public int getRentalsPerMonth(int month) {
        int count = 0;
        for (Rental rental : rentals) {
            if (rental.getStartDate().getMonthValue() == month) {
                count++;
            }
        }
        return count;
    }

    public Car getMostRentedCar() {
        int[] carCount = new int[rentals.size()];
        int maxIndex = 0;
        for (int i = 0; i < rentals.size(); i++) {
            for (int j = i+1; j < rentals.size(); j++) {
                if (rentals.get(i).getRentedCar().getId() == rentals.get(j).getRentedCar().getId()) {
                    carCount[i]++;
                    if (carCount[i] > carCount[maxIndex]) {
                        maxIndex = i;
                    }
                }
            }
        }
        return rentals.get(maxIndex).getRentedCar();
    }

    public void getRentalFeeStatistics() {
        int totalRentalFee = 0;
        int totalDuration = 0;
        int rentalCount = 0;

        for (Rental rental : rentals) {
            totalRentalFee += rental.getRentalFee();
            totalDuration += rental.getEndDate().getDayOfYear() - rental.getStartDate().getDayOfYear();
            rentalCount++;
        }

        int avgRentalFee = 0;
        if (rentalCount > 0) {
            avgRentalFee = totalRentalFee / rentalCount;
        }

        int avgDuration = 0;
        if (rentalCount > 0) {
            avgDuration = totalDuration / rentalCount;
        }

        System.out.println("Total Rental Fees: " + totalRentalFee);
        System.out.println("Average Rental Fee per Rental: " + avgRentalFee);
        System.out.println("Average Rental Duration per Rental: " + avgDuration + " days");
    }

}
