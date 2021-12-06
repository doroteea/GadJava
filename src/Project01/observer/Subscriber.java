package Project01.observer;

public class Subscriber implements Observer{
    private String username;
    private String email;

    public Subscriber(String username, String email) {
        this.username = username;
        this.email = email;
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
        System.out.println("Subscriber "+username+" received email about "+ message);
    }

    public void listenTo(NewsLetter newsLetter){
        newsLetter.subscribe(this);
    }
}
