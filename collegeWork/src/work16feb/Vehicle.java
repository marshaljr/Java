package work16feb;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running fast");
    }
}

class Bike extends Vehicle {
	 void run() {                       // 3. Method is Overridden
	        System.out.println("Bike is running smoothly"); // 5. Different Output at Runtime
	    }
}



