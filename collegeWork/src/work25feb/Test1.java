package work25feb;

abstract class Shape {

	   // Abstract method (no body)
	   abstract void area();
	}

	// Child class 1
	class Circle extends Shape {

	   void area() {
	       double radius = 5;
	       double result = 3.14 * radius * radius;
	       System.out.println("Area of Circle = " + result);
	   }
	}

	// Child class 2
	class Rectangle extends Shape {

	   void area() {
	       int length = 10;
	       int width = 4;
	       int result = length * width;
	       System.out.println("Area of Rectangle = " + result);
	   }
	}

	public class Test1 {
	   public static void main(String[] args) {

	       // Direct object creation (NO polymorphism)
	       Circle c = new Circle();
	       c.area();

	       Rectangle r = new Rectangle();
	       r.area();
	   }
	}
