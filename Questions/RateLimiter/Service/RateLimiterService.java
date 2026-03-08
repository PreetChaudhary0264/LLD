package Questions.RateLimiter.Service;

import Questions.RateLimiter.Domain.RateLimiter;

public class RateLimiterService {

    RateLimiter rl;
    public RateLimiterService(){
        rl = new RateLimiter(5,1000);
    }

    public boolean checkRequest(String user){
        return rl.allowRequest(user);
    }
}
