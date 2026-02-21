package inheritance20feb;

public class Animal {
	String name;
    Animal(String name) { this.name = name; }
    void makeSound() { System.out.println(name + " makes a sound."); }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    void bark() { System.out.println(name + " barks: Woof!"); }

    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.makeSound(); // inherited
        d.bark();      // own method
    }

}
