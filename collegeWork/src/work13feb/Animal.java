package work13feb;

//Base class
class Animal {
 void sound() {
     System.out.println("Some generic animal sound");
 }

 void info() {
     System.out.println("I am an Animal");
 }
}

//Subclass that overrides Animal methods
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Bark");
 }

 @Override
 void info() {
     // call base class implementation, then extend it
     super.info();
     System.out.println("I am a Dog");
 }
}

