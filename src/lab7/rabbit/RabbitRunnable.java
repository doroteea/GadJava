package lab7.rabbit;

public class RabbitRunnable implements Runnable{
    private int nr;
    public RabbitRunnable(int nr){
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit no. " + nr + " is running");
    }
}
