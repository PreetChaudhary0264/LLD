package Threads.problem;

public class Main {
    public static void main(String[] args) {
        System.out.println("order Placed");
        sendSms();
        //we can also do
        //Runnable r = () -> sendSms();
//        Thread t = new Thread(() -> sendSms());   //u dont need to always create an class
        System.out.println("task 1 done");
        sendEmail();
        System.out.println("task 2 done");
        calculateETA();
        System.out.println("task 3 done");
    }
    public static void sendSms(){
        try{
            Thread.sleep(2000);
            System.out.println("sending sms");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void sendEmail(){
        try{
            Thread.sleep(3000);
            System.out.println("sending email");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static String calculateETA(){
        try{
            Thread.sleep(4000);
            System.out.println("calculating ETA");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "25 minutes";
    }
}
