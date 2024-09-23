import java.util.*;

class Vehicle {
    String make, model, fuelType;
    int year;

    // Constructor
    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }

    double calculateFuelEfficiency() {
        return 0; // Override in subclasses
    }

    double calculateDistanceTraveled(double fuelUsed) {
        return fuelUsed * calculateFuelEfficiency();
    }

    int maxSpeed() {
        return 0; // Override in subclasses
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 15; // Example: 15 km per liter
    }

    @Override
    int maxSpeed() {
        return 180; // Example: Max speed of 180 km/h
    }
}



class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 25; // Example: 25 km per liter
    }

    @Override
    int maxSpeed() {
        return 200; // Example: Max speed of 200 km/h
    }
}

 class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a vehicle type: 1. Car 2. Motorcycle");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter make: ");
        String make = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter fuel type: ");
        String fuelType = sc.nextLine();
        sc.close();
        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car(make, model, year, fuelType);
        }  else {
            vehicle = new Motorcycle(make, model, year, fuelType);
        }

        vehicle.displayInfo();

        System.out.print("Enter fuel used (in liters): ");
        double fuelUsed = sc.nextDouble();

        System.out.println("Distance traveled: " + vehicle.calculateDistanceTraveled(fuelUsed) + " km");
        System.out.println("Maximum speed: " + vehicle.maxSpeed() + " km/h");
    }
}
