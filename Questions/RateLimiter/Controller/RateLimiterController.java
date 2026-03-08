package Questions.RateLimiter.Controller;

import Questions.RateLimiter.Service.RateLimiterService;

public class RateLimiterController {
    RateLimiterService rls = new RateLimiterService();

    public void handleReauest(String user){
        if(rls.checkRequest(user)){
            System.out.println("Request allowed");
        }else{
            System.out.println("Rate limited exceeded");
        }
    }
}
