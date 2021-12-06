package Project01.observer;

import java.util.Arrays;

public class NewsLetter implements Observable{

    Observer[] subscribers = new Observer[0];
    @Override
    public void subscribe(Observer obj) {
        int length = subscribers.length+1;
        subscribers = Arrays.copyOf(subscribers,length);
        subscribers[length-1] = obj;
    }

    @Override
    public void unsubscribe(Observer obj) {
    Observer[] updatedArray = new Observer[subscribers.length - 1];
        for(int i=0,k=0;i<subscribers.length;i++){
            if(subscribers[i]!=obj){
                updatedArray[k++] = subscribers[i];
            }
        }
        subscribers= Arrays.copyOf(updatedArray,updatedArray.length);
    }

    @Override
    public void notifySubscribers(String message) {
        for(Observer subscriber : subscribers){
            subscriber.notify(message);
        }
    }
}
