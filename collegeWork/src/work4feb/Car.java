package work4feb;

public class Car extends Vehicle {
	 // Private variable specific to Car
    private int numberOfDoors;

    // Constructor
    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Getter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Display car details
    public void displayCar() {
        displayVehicle();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
