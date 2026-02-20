package DeadLocks;

public class TransferTask implements Runnable{
    private BankAccount from;
    private BankAccount to;
    int amount;

    TransferTask(BankAccount from,BankAccount to,int a){
        this.from = from;
        this.to = to;
        this.amount = a;
    }
    @Override
    public void run() {
        synchronized (from){  //t1 locks onn account A and t2 locks on account B
            System.out.println(Thread.currentThread().getName() + " locked" + from.getName());

            try{Thread.sleep(2);}catch(Exception e){System.out.println(e);}

            synchronized (to){  //t1 tried to lock account B(but it is locked by thread t2) and same for t2.
                System.out.println(Thread.currentThread().getName() + " locked" + to.getName());

                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Amount transferred from " + from.getName() + " to " + to.getName());
            }
        }
    }
}
