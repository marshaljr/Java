package work30jan;

class Student {
	String name;
	int age;

	// Constructor
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to check teenager
	boolean isTeenager() {
		return age >= 13 && age <= 19;
	}
}

public class IsTeenager {

	public static void main(String[] args) {

		Student s1 = new Student("Marshal", 20);
		Student s2 = new Student("Ram", 19);
		Student s3 = new Student("Mehara", 13);

		System.out.println(s1.name + " is teenager: " + s1.isTeenager());
		System.out.println(s2.name + " is teenager: " + s2.isTeenager());
		System.out.println(s3.name + " is teenager: " + s3.isTeenager());

	}
}
