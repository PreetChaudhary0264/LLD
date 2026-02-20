package DeadLocks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount a = new BankAccount(1000,"Account A");
        BankAccount b = new BankAccount(1000,"Account B");

        Thread t1 = new Thread(new TransferTask(a,b,300));
        Thread t2 = new Thread(new TransferTask(b,a,300));
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Finished");
    }
}
