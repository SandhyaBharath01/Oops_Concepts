package Polymorphism;

public class MethodOverridingClient {
    public static void main(String[] args) {
        MethodOverriding1 m1 = new MethodOverriding1();
        MethodOverriding2 m2 = new MethodOverriding2();

        System.out.println(m1.getName());
        m1.getNumberOfTeamMembers();
        System.out.println(m2.getName());
        m2.getNumberOfTeamMembers();


    }
}
