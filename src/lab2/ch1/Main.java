package lab2.ch1;

import lab2.ch2.Actor;
import lab2.ch2.Film;
import lab2.ch2.Premiu;
import lab2.ch2.Studio;

public class Main {
    public static void main(String[] args) {
        //ch1
        Fighter f1 = new Fighter("f1",100,10);
        Fighter f2 = new Fighter("f2",100,10);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        System.out.println("Winner: " + boxingMatch.fight() );
        System.out.println("Number of fighters: " + Fighter.getCounter());
    }
}
