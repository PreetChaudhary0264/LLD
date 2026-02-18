package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmailService {
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void sendEmail(String user){
        executor.execute(()->{
            System.out.println("email sending to " + user + " using " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println();
            }
            System.out.println("email sent to "+  user);
        });

//        Future<Integer> future = executor.submit(()->{  //submit with callable
//              Thread.sleep(2000);
//              return 42;
//        });
//        //we can also use submit with runnable
//        System.out.println("Doing other work");
//        try{
//            Integer result = future.get();
//            System.out.println(result);
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    }

    public static void main(String[] args) {
        for(int i = 1;i  <= 25; i++){
            sendEmail("user with ID "+ i);
        }
        executor.shutdown();
    }
}
