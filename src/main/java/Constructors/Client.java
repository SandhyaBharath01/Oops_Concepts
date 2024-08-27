package Constructors;

public class Client {
    public static void main(String[] args) {
        Book bk = new Book();
        System.out.println("Book1 Title is " + bk.title);
        System.out.println("Book1 Author is " + bk.author);
        System.out.println("Book1 Price is " + bk.price);

        Book bk1 = new Book("Java","xyz",100);
        System.out.println("Book2 Title is " + bk1.title);
        System.out.println("Book2 Author is " + bk1.author);
        System.out.println("Book2 Price is " + bk1.price);
    }

}
