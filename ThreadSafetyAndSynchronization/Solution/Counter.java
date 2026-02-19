package ThreadSafetyAndSynchronization.Solution;

public class Counter {
    private volatile int count = 0;

    public synchronized void increment(){
//        synchronized (this){             synchronized block
//            count++;
//        }
        count++;
    }
    public int getCount(){
        return count;
    }
}
