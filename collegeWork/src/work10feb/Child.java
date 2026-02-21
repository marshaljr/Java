package work10feb;

public class Child extends Parent {

	void role() {
		super.role();
		System.out.println("I am a child class");
	}

	public static void main(String[] args) {
		Child cs = new Child();
		cs.role();
	}
}