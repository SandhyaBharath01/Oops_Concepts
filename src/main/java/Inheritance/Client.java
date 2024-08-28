package Inheritance;

public class Client {
    public static void main(String[] args) {
        Bird bd = new Bird();
        bd.walk();
        bd.fly();
        bd.sing();
    }
}
//Single Inheritance:
//Class Animal{
//     void walk(){
//        System.out.println("Animal is walking");
//   }
//}
//Class Bird extends Animal{
//    void fly(){
//        System.out.println("Bird is flying");
//    }
//}
//--------------------------
//Multilevel Inheritance:
//Class Animal{
//     void walk(){
//        System.out.println("Animal is walking");
//   }
//}
//Class Bird extends Animal{
//    void fly(){
//        System.out.println("Bird is flying");
//    }
//}
//Class Parrot extends Bird{
//    void kuku(){
//        System.out.println("Parrot says kuku");
//    }
//}
//--------------------------
//Hierarchy Inheritance: Multiple subclasses inherits from a single parent Class
//Class Animal{
//     void walk(){
//        System.out.println("Animal is walking");
//   }
//}
//Class Dog extends Animal{
//    void bark(){
//        System.out.println("Dog is barking");
//    }
//}
//Class Cat extends Animal{
//    void meow(){
//        System.out.println("Cat says meomeo");
//    }
//}
//-------------------------
//Hybrid Inheritance: Combination of multiple and multilevel Inheritance
//interface Animal {
//    void eat();
//}
//
//interface Mammal extends Animal {
//    void walk();
//}
//
//class Dog implements Animal, Mammal {
//    public void eat(){
//	 System.out.println("Eating...");
//}
//    public void walk() {
//	System.out.println("Walking...");
//    }
//    public void bark() {
//	System.out.println("Barking...");
//    }
//}
//------------------------------------
//Multiple Inheritance: A child class inherits properties from one or more parent class and this feature is not directly
//interface Flyable {
//    void fly();
//}
//
//interface Walkable {
//    void walk();
//}
//
//class Bird implements Flyable, Walkable {
//    public void fly() {
//	System.out.println("Flying...");
//    }
//    public void walk() {
//	 System.out.println("Walking...");
//    }
//}
