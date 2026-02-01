package BehaviouralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{
    private Subscriber allSubs;
    private String channelName;
    List<Subscriber> subs = new ArrayList<>();

    public YoutubeChannel(String channel){
        this.channelName = channel;
    }
    @Override
    public void subscribe(Subscriber subscriber) {
        subs.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {

    }
}
