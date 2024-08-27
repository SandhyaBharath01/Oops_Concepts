package AccessModifiers;

public class ClassA {
    //public : access anywhere
    public int number = 10;
    public void publicMethod(){
        System.out.println("printing from public method");
    }

    //private : only within the class
    private String name;
    public void privateMethod(){
        System.out.println("This is a private method");
    }

    //Default :  within the package and within the class

    //Protected : with in the class and package and also outside package of child class

}
