package lab5;

import lab5.ch2.Boot;
import lab5.ch2.Pair;
import lab5.ch2.Running;
import lab5.ch2.Shoe;

public class Main {
    public static void main(String[] args) {
        Boot boot1 = new Boot(20,"Green");
        Boot boot2 = new Boot(20,"Green");
        Running running1 = new Running(20,"Green");
        Running running2 = new Running(20,"Green");

        try {
            Pair<Boot> pair1 = new Pair<Boot>(boot1, boot2);
            Pair<Running> pair2 = new Pair<Running>(running1, running2);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
