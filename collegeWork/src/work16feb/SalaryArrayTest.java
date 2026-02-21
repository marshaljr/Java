package work16feb;

//SalaryArrayTest.java
public class SalaryArrayTest {

 public static void main(String[] args) {

     // Create array of parent type
     Employee[] employees = new Employee[2];

     // Store child objects
     employees[0] = new FullTimeEmployee(60000);
     employees[1] = new PartTimeEmployee(30, 400);

     // Loop and print salaries (Runtime Polymorphism)
     for (int i = 0; i < employees.length; i++) {
         System.out.println("Salary: " + employees[i].calculateSalary());
     }
 }
}