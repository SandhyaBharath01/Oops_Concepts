package AccessModifiers;

public class ClassB {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        //public
        System.out.println(ca.number);
        ca.publicMethod();

        //private
//        System.out.println(ca.name); /* Cannot access name




    }
}
