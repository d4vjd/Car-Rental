import java.time.LocalDate;

class Rental {
    private int rentalId;
    private Car rentedCar;
    private Client client;
    private LocalDate startDate;
    private LocalDate endDate;
    private double rentalFee;

    public Rental() {
        this.rentalId = 0;
        this.rentedCar = new Car();
        this.client = new Client();
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now();
        this.rentalFee = 0.0;
    }
    public Rental(int rentalId, Car rentedCar, Client client, LocalDate startDate, LocalDate endDate, double rentalFee) {
        this.rentalId = rentalId;
        this.rentedCar = rentedCar;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentalFee = rentalFee;
    }

    // Getters and Setters
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void assign(Rental otherRental) {
        this.rentalId = otherRental.rentalId;
        this.client = otherRental.client;
        this.rentalFee = otherRental.rentalFee;
        this.rentedCar = otherRental.rentedCar;
        this.startDate = otherRental.startDate;
        this.endDate = otherRental.endDate;
    }

}
