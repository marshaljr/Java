package inheritance20feb;

public class Person {
	Person() { System.out.println("Person is created"); }
    void greet() { System.out.println("Hello from Person"); }
}

class Student extends Person {
    Student() {
        super(); // calls Person constructor
        System.out.println("Student is created");
    }
    @Override
    void greet() {
        super.greet();
        System.out.println("Hello from Student");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.greet();
    }

}
