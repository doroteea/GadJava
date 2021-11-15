package lab3.decorator;

import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Topping milk = new Milk(coffee);
        Beverage whip = new Whip(milk);//punem frisca peste cafeaua cu lapte
        System.out.println(whip.getDescription() + " " + whip.getCost());

        Tea tea = new Tea();
        Milk teaMilk = new Milk(tea);
        System.out.println(teaMilk.getDescription());

    }
}
