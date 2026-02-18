package Threads.RunnableInterface;

import java.security.spec.ECField;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new SMSThreadRunnable());
        thread.start();
        System.out.println("task1 started");
        Thread thread2 = new Thread(new EmailThreadRunnable());
        thread2.start();
        System.out.println("task 2 started");

//        Thread eta = new Thread(new ETACallable());
        //thread expects runnable but ETACallable is callable not runnable

        FutureTask etaRunnable = new FutureTask(new ETACallable());
        Thread eta = new Thread(etaRunnable);
        eta.start();
        System.out.println("Task 3 started");

        //how do u get yhe result?  we can use futuretask

        try{
            eta.join();
            String res = (String) etaRunnable.get();  //this will give u of type Object so typecast it
            System.out.println("ETA IS: " + res);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
