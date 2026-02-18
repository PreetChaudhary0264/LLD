package Threads.solution;

public class SMSThread extends Thread {
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("sms sent");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
