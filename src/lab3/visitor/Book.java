package lab3.visitor;

public class Book implements Element {
    private String name;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private int numberOfPages;
    private String author;

    public int getPrice() {
        return price;
    }

    private int price;

    public Book(String name, int numberOfPages, int price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void accept (Visitor v){
        v.visit(this);
    }
    public String toString(){
        return name + ", price :" + price + "pages :" + numberOfPages + ", author :" + author ;
    }
}
