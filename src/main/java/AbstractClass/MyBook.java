package AbstractClass;

public class MyBook extends Book{
    @Override
    void setTitle(String s) {
     this.title = s;
    }
    String getTitle(){
        return this.title;
    }
}
