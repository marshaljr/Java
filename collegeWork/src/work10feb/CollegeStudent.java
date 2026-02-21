package work10feb;

class Parents {
	String name;
	int age;

	Parents(String name) {
		this.name = name;
	}

	void role() {
		System.out.println("I am a parent class: " + name);
	}
}

public class CollegeStudent extends Parents {

	CollegeStudent(String name) {
		super(name);
	}

	void role() {
		super.role();
		System.out.println("I am a child class");
	}

	public static void main(String[] args) {
		CollegeStudent cs = new CollegeStudent("Ram");
		cs.role();
	}
}