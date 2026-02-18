package Threads.RunnableInterface;

public class EmailThreadRunnable implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("email sent");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
