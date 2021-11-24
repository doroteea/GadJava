package lab7.inference;

import lab7.rabbit.RabbitThread;

public class Main {
    public static int v = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(v);
        Object lock = new Object();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    v++;
                }

                System.out.println(v);
            }
        };

        for (int i = 0; i < 500; i++) {
            (new Thread(runnable)).start();
        }
        Thread.sleep(100);
        System.out.println("result=" + v);
    }
}
