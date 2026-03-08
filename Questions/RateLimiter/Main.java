package Questions.RateLimiter;

import Questions.RateLimiter.Controller.RateLimiterController;

public class Main {
    public static void main(String[] args) {
        RateLimiterController rl = new RateLimiterController();

        for(int i = 0; i < 10; i++){
            rl.handleReauest("preet");
        }
    }
}
