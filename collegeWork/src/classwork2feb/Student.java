package classwork2feb;

public class Student {
	private String name;
	private int age;
	
	Student(String n, int a){
		name = n;
		age =  a;
	}
	void setName(String n) {
		name = n;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

}
