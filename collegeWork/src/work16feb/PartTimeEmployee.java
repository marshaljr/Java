package work16feb;

//PartTimeEmployee.java
public class PartTimeEmployee extends Employee {

 int hoursWorked;
 double ratePerHour;

 // Constructor
 public PartTimeEmployee(int hoursWorked, double ratePerHour) {
     this.hoursWorked = hoursWorked;
     this.ratePerHour = ratePerHour;
 }

 // Override method
 @Override
 public double calculateSalary() {
     return hoursWorked * ratePerHour;
 }
}