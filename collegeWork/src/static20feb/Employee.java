package static20feb;

public class Employee {
	static int employeeCount = 0;
    String name;

    Employee(String name) {
        this.name = name;
        employeeCount++;
    }

    public static void main(String[] args) {
        new Employee("A");
        new Employee("B");
        new Employee("C");
        System.out.println("Total employees: " + Employee.employeeCount); // 3
    }

}
