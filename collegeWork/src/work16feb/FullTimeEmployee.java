package work16feb;

//FullTimeEmployee.java
public class FullTimeEmployee extends Employee {

 double monthlySalary;

 // Constructor
 public FullTimeEmployee(double monthlySalary) {
     this.monthlySalary = monthlySalary;
 }

 // Override method
 @Override
 public double calculateSalary() {
     return monthlySalary;
 }
}
