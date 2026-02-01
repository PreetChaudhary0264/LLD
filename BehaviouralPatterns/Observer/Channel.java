package BehaviouralPatterns.Observer;

public interface Channel {
    void subscribe(Subscriber subs);
    void unsubscribe(Subscriber subs);
    void notifySubscribers();
}
