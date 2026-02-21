package work16feb;

//SalaryTest.java
public class SalaryTest {

 public static void main(String[] args) {

     Employee e;  // Parent reference

     // Assign FullTimeEmployee object
     e = new FullTimeEmployee(50000);
     System.out.println("Full-Time Salary: " + e.calculateSalary());

     // Assign PartTimeEmployee object
     e = new PartTimeEmployee(40, 500);
     System.out.println("Part-Time Salary: " + e.calculateSalary());
 }
}