package lab3.visitor;

public class Audio implements Element{
    public Audio(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    private String name;

    public int getPrice() {
        return price;
    }

    private int price;

    public int getTime() {
        return time;
    }

    private int time;
    public void accept (Visitor v){
        v.visit(this);
    }
    public String toString(){
        return name + ", price :" + price + " ,time :" + time;
    }

}
