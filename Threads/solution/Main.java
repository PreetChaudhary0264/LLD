package Threads.solution;

public class Main {
    public static void main(String[] args) {
        SMSThread sms = new SMSThread();
        EMAILThread email = new EMAILThread();
        sms.start();
        System.out.println("task1 ongoing");
        email.start();
        System.out.println("task2 ongoing");

        try{
            sms.join();
            email.join();
            System.out.println("Thread dies and task done");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
