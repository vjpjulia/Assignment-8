public class ObserverPattern {
    public static void main(String[] args) {
        // Creating News Agency
        NewsAgency newsAgency = new NewsAgency();

        // Creating Subscribers
        Subscriber subscriber1 = new Subscriber("User 1");
        Subscriber subscriber2 = new Subscriber("User 2");

        // Subscribers subscribing to the news agency
        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        // News agency publishing breaking news
        newsAgency.publishNews("Important Event!");

        // Subscriber1 unsubscribing
        newsAgency.unsubscribe(subscriber1);

        // News agency publishing more breaking news
        newsAgency.publishNews("Another Important Event!");
    }
}