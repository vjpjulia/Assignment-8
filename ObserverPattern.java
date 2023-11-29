public class ObserverPattern {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber("User 1");
        Subscriber subscriber2 = new Subscriber("User 2");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        newsAgency.publishNews("Important Event!");

        newsAgency.unsubscribe(subscriber1);

        newsAgency.publishNews("Another Important Event!");
    }
}