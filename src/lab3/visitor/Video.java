package lab3.visitor;

public class Video implements Element{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private String name;
    private String type;
    private int price;
    private int time;

    public Video(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public void visit (Visitor v){
        v.visit(this);
    }
    public String toString(){
        return name + ", price :" + price + " ,time :" + time;
    }

    public void accept (Visitor v){
        v.visit(this);
    }

}
