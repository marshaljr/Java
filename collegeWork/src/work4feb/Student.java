package work4feb;

public class Student extends Person {
    // Private variable specific to Student
    private int rollNumber;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        super(name, age); // Call the Person constructor
        this.rollNumber = rollNumber;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Display student details
    public void displayStudent() {
        displayPerson(); // Show person details
        System.out.println("Roll Number: " + rollNumber);
    }
}
