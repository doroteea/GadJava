package lab7.rabbit;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++){
            if(i%2==0){
                (new RabbitThread(i)).run();
            }
            else{
                new Thread(new RabbitThread(i)).start();
            }
        }
    }
}
