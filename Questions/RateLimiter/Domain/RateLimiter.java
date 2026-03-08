package Questions.RateLimiter.Domain;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RateLimiter {
    private Map<String, Deque<Long>> mpp;
    private int limit;
    private int windowSize;

    public RateLimiter(int limit, int windowSize){
        this.limit = limit;
        this.windowSize = windowSize;
        this.mpp = new HashMap<>();
    }

    public boolean allowRequest(String user){
        mpp.putIfAbsent(user, new LinkedList<>());
        Deque<Long> r = mpp.get(user);

        long now = System.currentTimeMillis();

        while(!r.isEmpty() && now - r.peekFirst() > windowSize){
            r.pollFirst();
        }

        r.addLast(now);
        if(r.size() > limit)return false;
        return true;
    }
}
