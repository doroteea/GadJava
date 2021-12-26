package Project01.observer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Article a1 = new Article("Dragons exist!", Arrays.asList("Lisa","Teddy","Irene"),76,Category.BREAKING_NEWS,"oH NOO! We gonna die! And miss sesiune fizic ...is dying actually that bad??");
        Article a2 = new Article("Snowing in Sahara",Arrays.asList("Chris Evans","Jennie","Rose"),56,Category.WEATHER,"The cherry on the today's dessert : Sahara is no longer a desert!");
        Article a3 = new Article("Kanye West won the elections!",Arrays.asList("Karina","Giselle","Joy"),77,Category.POLITIC,"Our Hero or Villain??? The world aka America will go into a new era.");

        NewsLetter newsLetter = new NewsLetter();

        Subscriber subscriber1 = new Subscriber("subscriber1","subscriber1@yahoo.com",Arrays.asList(Category.WEATHER,Category.POLITIC));
        Subscriber subscriber2 = new Subscriber("subscriber2","subscriber2@yahoo.com",Arrays.asList(Category.BREAKING_NEWS,Category.POLITIC,Category.BREAKING_NEWS));
        Subscriber subscriber3 = new Subscriber("subscriber3","subscriber3@yahoo.com",Arrays.asList(Category.POLITIC));
        Subscriber subscriber4 = new Subscriber("subscriber4","subscriber4@yahoo.com",Arrays.asList(Category.BREAKING_NEWS));

        subscriber1.listenTo(newsLetter);
        subscriber2.listenTo(newsLetter);
        subscriber3.listenTo(newsLetter);
        subscriber4.listenTo(newsLetter);

        newsLetter.notifySubscribers(a1);
        newsLetter.notifySubscribers(a2);
        newsLetter.notifySubscribers(a3);





    }


}
