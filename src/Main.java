import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(0,"Dacia", "Logan", "Silver", 2020);
        Client client1 = new Client(0,"Ion Pop", "1234 Main St.", "0741-414-414");

        LocalDate starDate1 = LocalDate.now();
        LocalDate endDate1 = LocalDate.of(2024, Month.JANUARY, 1);
        Rental rental1 = new Rental(0,car1, client1, starDate1, endDate1,255.99);

        Garage garage1 = new Garage();
        garage1.addCar(car1); //add car1 to garage1
        Car car2 = new Car();
        //car2.addCarFromInput(garage1); //add car2 to garage1 with keyboard input
        garage1.displayCars();

        ClientBook clientBook1 = new ClientBook();
        clientBook1.addClient(client1); //add client1 to clientBook1
        Client client2 = new Client();
        //client2.addClientFromInput(clientBook1); //add client2 to clientBook1 with keyboard input
        clientBook1.displayClients();

        RentalAgenda rentalAgenda1 = RentalAgenda.getInstance();
        rentalAgenda1.addRental(rental1);
        rentalAgenda1.displayRentals();
    }
}