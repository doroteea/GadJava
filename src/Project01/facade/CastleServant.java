package Project01.facade;

import java.util.Arrays;
import java.util.List;

public abstract class CastleServant {
    private String name;

    public abstract void work(String name);

    public CastleServant(String name) {
        this.name = name;
    }

    public void goToSleep() {
        System.out.println(name + " goes to sleep");
    }

    public void wakeUp() {
        System.out.println(name+" wakes up.");
    }

    public void goHome() {
        System.out.println(name+" goes home.");
    }

    public void goToMine() {
        System.out.println(name+" goes to the castle.");
    }
    private void action(Action action) {
        switch (action) {
            case SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_CASTLE:
                goToMine();
                break;
            case WORK:
                work(name);
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }

    public void actionOfServant(Action[] actions) {
        for(Action a : actions){
            this.action(a);
        }
       // Arrays.stream(actions).forEach(this::action);
    }

}
