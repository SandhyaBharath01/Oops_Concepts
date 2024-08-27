package IntroToOops;

public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog("Smarty", "Pammalian");
        Dog d2 = new Dog("Benzie", "Labra");
        System.out.println(d1.getName() + " is a " + d1.getBreed());
        System.out.println(d2.getName() + " is a " + d2.getBreed());

        //to update values
//        d1.setName("Leo");
        d2.setBreed("Hutch");

        System.out.println(d2.getName() + " is now a " + d2.getBreed());
    }
}
