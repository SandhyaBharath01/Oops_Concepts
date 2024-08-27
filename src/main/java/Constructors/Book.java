package Constructors;

public class Book {
    String title;
    String author;
    int price;

    //Default Constructor
    Book(){
        this.title = null;
        this.author = null;
        this.price = 0;
    }

    //Parameterised Constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
