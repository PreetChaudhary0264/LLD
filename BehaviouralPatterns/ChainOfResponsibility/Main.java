package BehaviouralPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        MoneyHandler thousandHandler = new ThousandNotesHandler(4);
        MoneyHandler fiveHundredHandler = new FiveHundredNotesHandler(2);

        thousandHandler.setNextHandler(fiveHundredHandler);
        fiveHundredHandler.setNextHandler(null);

        thousandHandler.dispense(7500);
    }
}
