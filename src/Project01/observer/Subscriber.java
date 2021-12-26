package Project01.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer{
    private String username;
    private String email;
    private List<Category> categories = new ArrayList<>();

    public Subscriber(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Subscriber(String username, String email, List<Category> categories) {
        this.username = username;
        this.email = email;
        this.categories = categories;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("Subscriber "+username+" received email about article: "+ message);
    }

    @Override
    public Boolean hasCategory(Category category) {
        for(Category c : categories){
            if(category.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public void listenTo(NewsLetter newsLetter){
        newsLetter.subscribe(this);
    }
}
