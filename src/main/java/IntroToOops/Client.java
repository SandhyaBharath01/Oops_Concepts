package IntroToOops;

public class Client {
    public static void main(String[] args) {
        PrintStudent ps1 = new PrintStudent();
        ps1.name = "Abc";
        ps1.age = 20;
        ps1.display();

        PrintStudent ps2 = new PrintStudent();
        ps2.name = "xyz";
        ps2.age = 30;
        ps2.display();

        ps1.sayHello(ps2.name);
    }
}
