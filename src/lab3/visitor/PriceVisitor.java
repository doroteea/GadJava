package lab3.visitor;

public class PriceVisitor implements Visitor{
    public int getTotalPrice() {
        return totalPrice;
    }

    private int totalPrice = 0;
    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(Video video) {
        totalPrice+= video.getPrice();
    }

    @Override
    public void visit(Audio audio) {
        totalPrice+=audio.getPrice();
    }

    public String toString(){
        return "Total price is : " + totalPrice;
    }
}
