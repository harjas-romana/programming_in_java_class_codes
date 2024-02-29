class Vehicle {
    private final int id;
    private final String manufacturer;
    private final String model;
    private final int yearOfManufacture;

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
    private final int numberOfDoors;
    private final String fuelType;

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

class Truck extends Vehicle {
    private final int loadCapacity;
    private final boolean trailerAttached;

    public Truck(int id, String manufacturer, String model, int yearOfManufacture, int loadCapacity, boolean trailerAttached) {
        super(id, manufacturer, model, yearOfManufacture);
        this.loadCapacity = loadCapacity;
        this.trailerAttached = trailerAttached;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Load Capacity: " + loadCapacity + " Ton");
        System.out.println("Trailer Attached: " + trailerAttached);
    }
}

class Motorcycle extends Vehicle {
    private final int engineCapacity;
    private final boolean sportsBike;

    public Motorcycle(int id, String manufacturer, String model, int yearOfManufacture, int engineCapacity, boolean sportsBike) {
        super(id, manufacturer, model, yearOfManufacture);
        this.engineCapacity = engineCapacity;
        this.sportsBike = sportsBike;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Sports Bike: " + sportsBike);
    }
}

public class code_9 {
    public static void main(String[] args) {
        Car car = new Car(4538, "Hyundai", "Creta", 2020, 4, "Diesel");
        car.printDetails();
    }
}
