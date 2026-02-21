package static20feb;

public class Car {
	String model;                 // instance
    static int totalCarsSold = 0; // static

    Car(String model) {
        this.model = model;
        totalCarsSold++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Civic");
        Car c2 = new Car("Accord");
        System.out.println(c1.model + " sold. Total sold: " + Car.totalCarsSold);
        System.out.println(c2.model + " sold. Total sold: " + Car.totalCarsSold);
    }

}
