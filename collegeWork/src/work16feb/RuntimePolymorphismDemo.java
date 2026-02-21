package work16feb;

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v;                     // 4. Parent Class Reference is Used

        v = new Car();                 // 4. Vehicle reference points to Car
        v.run();                       // calls Car.run() -> "Car is running fast"

        v = new Bike();                // 4. Vehicle reference now points to Bike
        v.run();                       // calls Bike.run() -> "Bike is running smoothly"

        // Extra: show "one reference, many forms" with an array
        Vehicle[] garage = { new Car(), new Bike(), new Vehicle() };
        for (Vehicle vehicle : garage) {
            vehicle.run();             // runtime decides which run() executes
        }
    }
}
