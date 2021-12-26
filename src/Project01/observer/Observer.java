package Project01.observer;

public interface Observer {
     void notify(String message);
     Boolean hasCategory(Category category);
}
