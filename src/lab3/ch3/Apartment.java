package lab3.ch3;

public class Apartment {
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }

    String location;
    int monthlyRentCost;

    public Apartment(String location, int money) {
        this.location = location;
        this.monthlyRentCost = money;
    }

    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}
