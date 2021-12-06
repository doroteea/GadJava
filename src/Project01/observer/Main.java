package Project01.observer;

public class Main {
    public static void main(String[] args) {
        NewsLetter newsLetter = new NewsLetter();

        Subscriber subscriber1 = new Subscriber("subscriber1","subscriber1@yahoo.com");
        Subscriber subscriber2 = new Subscriber("subscriber2","subscriber2@yahoo.com");
        Subscriber subscriber3 = new Subscriber("subscriber3","subscriber3@yahoo.com");
        Subscriber subscriber4 = new Subscriber("subscriber4","subscriber4@yahoo.com");

        subscriber1.listenTo(newsLetter);
        subscriber2.listenTo(newsLetter);
        subscriber3.listenTo(newsLetter);
        subscriber4.listenTo(newsLetter);

        String[] articles = new String[]{"Breaking news: Dragons exist!"
        ,"Weather: It is snowing in Tanzania for the first time!"
        ,"Sport: First olympic sport competition without gender categories: rock climbing! "
        };

        for(String article : articles){
            newsLetter.notifySubscribers(article);
        }
    }


}
