package lab5.ch2;

public class AbstractShoe implements Shoe{
    public AbstractShoe(int size, String color) {
        this.size = size;
        this.color = color;
    }

    private int size;
    private String color;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }
}
