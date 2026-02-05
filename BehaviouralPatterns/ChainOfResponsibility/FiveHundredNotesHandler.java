package BehaviouralPatterns.ChainOfResponsibility;

public class FiveHundredNotesHandler extends MoneyHandler{
    int numOfNotes;
    private MoneyHandler nextHandler;

    FiveHundredNotesHandler(int notes){
        this.numOfNotes = notes;
    }
    public void setNextHandler(MoneyHandler next){
        this.nextHandler = next;
    }

    @Override
    void dispense(int amount) {
        int noteValue = 500;

        int notesToDispense = Math.min(amount / noteValue, numOfNotes);
        int dispensedAmount = notesToDispense * noteValue;
        int remainingAmount = amount - dispensedAmount;

        if (notesToDispense > 0) {
            System.out.println("Dispensing " + notesToDispense + " * " + noteValue + " notes");
        }

        if (remainingAmount > 0) {
            if (nextHandler != null) {
                nextHandler.dispense(remainingAmount);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }

}
