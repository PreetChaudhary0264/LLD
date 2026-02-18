package Threads.solution;

public class EMAILThread extends Thread{
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("email sent");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
