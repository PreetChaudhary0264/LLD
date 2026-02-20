package ThreadSafetyAndSynchronization.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class LikesCounter {
    AtomicInteger likes = new AtomicInteger(0);
//    int c = 0;
    int prev;
    int next;

    //User1 and User2 are two threads
    public void incrementLikes(){
        do{
            prev = likes.get();       //u1 => 10 and u2 = 10;
            next = prev + 1;          //u1 = 10 + 1 => 11 and same for u2 = 11;
        }while(!likes.compareAndSet(prev,next));   //now one thread have to wait, lets say u1 proceed so noe likes will become 11 and when u2 comes then prev will not be 10 so it need to go back and generate prev,next again
    }
}
