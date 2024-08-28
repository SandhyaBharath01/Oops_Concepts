package Polymorphism;

public class MethodOverloadingClient {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.sum(10,20));
        System.out.println(mo.sum(10,20,30));
        System.out.println(mo.sum(10.3,20.2));
    }
}

//Method Overloading:
//Method having same name but different parameters (data types or diff num of parameters)