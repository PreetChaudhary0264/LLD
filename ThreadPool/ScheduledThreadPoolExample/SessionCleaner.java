package ThreadPool.ScheduledThreadPoolExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SessionCleaner {
    public static void main(String[] args) {
//        AtomicInteger count = new AtomicInteger(0);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
//            if (count.getAndIncrement() > 3) {
//                executor.shutdown();
//                return;
//            }

            System.out.println("Cleaning up expired sessions");
        };
        executor.scheduleAtFixedRate(task,0,5, TimeUnit.SECONDS);
    }
}
