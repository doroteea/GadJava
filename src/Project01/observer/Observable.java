package Project01.observer;

public interface Observable {
    void subscribe(Observer obj);
    void unsubscribe(Observer obj);
    void notifySubscribers(Article a);
}
