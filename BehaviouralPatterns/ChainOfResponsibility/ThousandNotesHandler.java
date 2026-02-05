package BehaviouralPatterns.ChainOfResponsibility;

public class ThousandNotesHandler extends MoneyHandler{
    int numOfNotes;
    private MoneyHandler nextHandler;

    ThousandNotesHandler(int notes){
        this.numOfNotes = notes;
    }

    public void setNextHandler(MoneyHandler next){
        this.nextHandler = next;
    }
    @Override
    void dispense(int amount) {
        int noteValue = 1000;

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
