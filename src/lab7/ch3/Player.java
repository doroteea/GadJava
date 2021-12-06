package lab7.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Player extends Thread{
    private String name;
    private ArrayList<String> options = new ArrayList<String>(Arrays.asList("paper","rock","scissor"));
    private String option;
    public Player(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", option='" + option + '\'' +
                '}';
    }

    public String getOption() {
        return option;
    }

    public void run(){
    option = options.get(new Random().nextInt(2));
    }
}
