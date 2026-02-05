package BehaviouralPatterns.ChainOfResponsibility;

public abstract class MoneyHandler {
    abstract void dispense(int amount);
    abstract void setNextHandler(MoneyHandler next);
}
