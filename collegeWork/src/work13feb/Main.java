package work13feb;

public class Main {
	 public static void main(String[] args) {
	     Animal a = new Animal();
	     a.sound();         // prints: Some generic animal sound

	     Dog d = new Dog();
	     d.sound();         // prints: Bark
	     d.info();          // prints: I am an Animal \n I am a Dog

	     Animal p = new Dog(); // Polymorphism: reference type Animal, object Dog
	     p.sound();         // prints: Bark  (Dog's overridden method runs)
	     p.info();          // prints: I am an Animal \n I am a Dog
	 }
	}