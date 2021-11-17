package lab5.ch2;

public class Pair <T extends Shoe> {
    private T first;
    private T second;

    public Pair(T first, T second) throws Exception {
        this.first = first;
        this.second = second;

        if(!first.getColor().equals(second.getColor())){
            throw new Exception("Colors must match");
        }

        if(first.getSize()!=second.getSize()){
            throw new Exception("Sizes must match");
        }


    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
