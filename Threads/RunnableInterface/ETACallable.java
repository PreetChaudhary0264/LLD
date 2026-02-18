package Threads.RunnableInterface;

import java.util.concurrent.Callable;

public class ETACallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(4000);
            System.out.println("calculating ETA");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "25 minutes";
    }
}
