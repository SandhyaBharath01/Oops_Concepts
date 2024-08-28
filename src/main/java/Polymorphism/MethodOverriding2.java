package Polymorphism;

public class MethodOverriding2 extends MethodOverriding1 {
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Number of Team Members in " + getName());
    }
}

//Method Overriding: Methods with same name, same return type, same parameter list but having different implementation