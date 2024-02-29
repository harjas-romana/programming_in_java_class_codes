import java.util.Scanner;

class Vehicle {
    private int id;
    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    public Vehicle(int id, String manufacturer, String model, int yearOfManufacture) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printDetails() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(int id, String manufacturer, String model, int yearOfManufacture, int numberOfDoors, String fuelType) {
        super(id, manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class code_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Vehicle Management System!");

        // Get vehicle details
        System.out.println("\nEnter Vehicle Details:");
        System.out.print("Enter Vehicle ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Manufacturer: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year of Manufacture: ");
        int yearOfManufacture = scanner.nextInt();

        System.out.println("\nEnter Car Details:");
        System.out.print("Enter Number of Doors: ");
        int numberOfDoors = scanner.nextInt();

        System.out.print("Enter Fuel Type: ");
        scanner.nextLine(); // Consume newline character
        String fuelType = scanner.nextLine();

        // Create Car object
        Car car = new Car(id, manufacturer, model, yearOfManufacture, numberOfDoors, fuelType);

        // Print details
        System.out.println("\nVehicle Details:");
        car.printDetails();

        scanner.close();
    }
}
