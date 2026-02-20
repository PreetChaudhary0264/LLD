package DeadLocks;

public class BankAccount {
    private int amount;
    private String name;

    BankAccount(int amount, String name){
        this.amount = amount;
        this.name = name;
    }
    public String getName(){return name;}
    public int getAmount(){return amount;}

    public void deposit(int a){
        amount += a;
    }
    public void withdraw(int a){
        amount -= a;
    }
}
