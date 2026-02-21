package inheritance20feb;

public class Parent {
	static void showMessage() { System.out.println("Message from Parent"); }
	}

	class Child extends Parent {
	    static void showMessage() { System.out.println("Message from Child"); }
	}

	class Demo {
	    public static void main(String[] args) {
	        Parent.showMessage(); // Message from Parent
	        Child.showMessage();  // Message from Child
	        // static methods are called on the class, not dispatched polymorphically
	    }

}
