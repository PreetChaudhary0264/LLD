package ThreadSafetyAndSynchronization.Problem;

public class Counter {
    private int count = 0;

    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
