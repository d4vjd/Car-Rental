import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    Car(){

    }
    public Car(int id, String make, String model, String color, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void addCarFromInput(Garage garage) {
        int id = garage.getCars().size() + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Car Make: ");
        String make = input.next();
        System.out.print("Enter Car Model: ");
        String model = input.next();
        System.out.print("Enter Car Color: ");
        String color = input.next();
        System.out.print("Enter Car Year: ");
        int year = input.nextInt();
        Car newCar = new Car(id, make, model, color, year);
        garage.addCar(newCar);
    }

    public void assign(Car car2) {
        this.id = car2.id;
        this.make = car2.make;
        this.model = car2.model;
        this.color = car2.color;
        this.year = car2.year;
    }

    public void deleteCar(Car car) {
        car = null;
    }

}
