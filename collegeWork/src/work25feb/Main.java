//
//package work25feb;
//
//abstract class Shape {
//    abstract void draw();
//}
//
//class Circle extends Shape {
//    void draw() {
//        System.out.println("Drawing Circle");
//    }
//}
//
//class Rectangle extends Shape {
//    void draw() {
//        System.out.println("Drawing Rectangle");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Shape s = new Circle(); // valid: Shape reference, Circle object
//        s.draw();               // prints: Drawing Circle
//
//        s = new Rectangle();    // polymorphism: same reference, different object
//        s.draw();               // prints: Drawing Rectangle
//    }
//}