import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {
    private int id;
    private String location;
    private static List<Garage> garages = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();

    Garage(){

    }

    public Garage(int id, String location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static List<Garage> getGarages() {
        return garages;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void displayCars() {
        for (Car car : this.cars) {
            System.out.println("Car ID: " + car.getId());
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Color: " + car.getColor());
            System.out.println("Year: " + car.getYear());
            System.out.println("-------------------");
        }
    }

    public void assign(Garage garage) {
        this.id = garage.id;
        this.location = garage.location;
        this.cars = new ArrayList<>(garage.cars);
    }

    public void deleteCarFromGarage(int carId) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (car.getId() == carId) {
                cars.remove(i);
                System.out.println("Car with ID " + carId + " has been removed from the garage.");
                return;
            }
        }
        System.out.println("Car with ID " + carId + " was not found in the garage.");
    }
}
