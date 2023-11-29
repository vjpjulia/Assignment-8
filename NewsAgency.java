import java.util.ArrayList;
import java.util.List;

// Concrete Subject: NewsAgency
public class NewsAgency implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    // Method to simulate publishing breaking news
    public void publishNews(String news) {
        System.out.println("Breaking News: " + news);
        notifySubscribers(news);
    }
}