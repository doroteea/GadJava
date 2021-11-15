package lab3.decorator;

public abstract class Beverage {
    private String description;
    private int cost;

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public Beverage(String description, int cost){
    this.description = description;
    this.cost=cost;
    }
}
