package lab2.ch3;

public class Fish extends Animal{
    protected Fish() {
        super(0);
    }

    @Override
    void eat() {
        System.out.println("The fish eats!");
    }

    public void walk(){
        System.out.println("Fish cannot walk!");
    }

}
